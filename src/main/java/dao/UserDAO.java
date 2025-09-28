package dao;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import beans.Product;
import beans.Review;
import beans.User;
import enums.Role;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

 class UserDAO {
	
	private Map<Integer, User> users = new HashMap<>();
	private File file;
	
	private static String DELIM = ";";
	private static DateTimeFormatter DATE_FMT = DateTimeFormatter.ISO_LOCAL_DATE;
	
	public UserDAO() {
		
	}
	
	public UserDAO(String contextPath) {
		loadUsers(contextPath);
	}
	
	private int generateId() {
		if(users.isEmpty()) {
			return 1;
		}
		int maxId = 0;
		for(User user : users.values()) {
			if(user.getId() > maxId) {
				maxId = user.getId();
			}
		}
		return maxId + 1;
	}
	
	public Collection<User> getAll() { 
		return users.values();			//vraca i obrisane
	}
	
	public User getById(int id) {
		return users.get(id);
	}
	
	public List<User> findAll() {
	    List<User> list = new ArrayList<>(); 
	    for (User u : users.values()) {
	        if (!u.isDeleted()) {
	            list.add(u);			//vraca samo neobrisane
	        }
	    }
	    return list;
	}

	
	public User find(String username, String password) {
	    for (User u : users.values()) {
	        if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
	            return u;
	        }
	    }
	    return null;
	}
	
	private void saveAll(String contextPath) {
		try(BufferedWriter out = new BufferedWriter(new FileWriter(contextPath + "/users.txt"))){
			for(User u : users.values()) {
				out.write(serialize(u));
				out.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private String safe(String s) {
        return s == null ? "" : s.replace(";", ",");
    }
	
	private String joinIds(List<Integer> ids) {
        return (ids == null || ids.isEmpty())
                ? "-"
                : ids.stream().map(String::valueOf).reduce((a, b) -> a + "," + b).orElse("-");
    }

	
	private String serialize(User u) {
        return String.join(";",
                String.valueOf(u.getId()),
                safe(u.getFirstName()),
                safe(u.getLastName()),
                safe(u.getUsername()),
                safe(u.getEmail()),
                safe(u.getPhone()),
                safe(u.getPassword()),
                u.getBirthday() == null ? "" : u.getBirthday().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                safe(u.getPhoto()),
                safe(u.getDescription()),
                u.getRole() == null ? "" : u.getRole().name(),
                String.valueOf(u.isBlocked()),
                joinIds(u.getProductsForSaleIds()),
                joinIds(u.getPurchasedProductsIds()),
                joinIds(u.getReviewIds()),
                String.valueOf(u.getRate()),
                String.valueOf(u.isDeleted())
        );
    }
	
	public User save(User user, String contextPath) {
	    if (user.getId() == 0) {
	        user.setId(generateId());
	    }
	    users.put(user.getId(), user);
	    saveAll(contextPath); // <<< ovde se zove privatna metoda
	    return user;
	}
	
	public User update(User user, String contextPath) {
		if(!users.containsKey(user.getId())) {
			return null;
		}
		users.put(user.getId(), user);
		saveAll(contextPath);
		return user;
	}
	
	//Logicko brisanje
	public void delete(int id, String contextPath) {
	    User u = users.get(id);
	    if (u != null) {
	        u.setDeleted(true);
	        saveAll(contextPath);
	    }
	}

	private void loadUsers(String contextPath) {
		BufferedReader in = null;
		try {
			File file = new File(contextPath + "/users.txt");
			in = new BufferedReader(new FileReader(file));
			String line;
			StringTokenizer st;
			while ((line = in.readLine()) != null) {
				line = line.trim();
				if (line.equals("") || line.indexOf('#') == 0)
					continue;
				st = new StringTokenizer(line, ";");
				while (st.hasMoreTokens()) {
					
					int id = Integer.parseInt(st.nextToken().trim());
					String firstName = st.nextToken().trim();
					String lastName = st.nextToken().trim();
					String username = st.nextToken().trim();
					String email = st.nextToken().trim();
					String phone = st.nextToken().trim();
					String password = st.nextToken().trim();
					String birthdayStr = st.nextToken().trim();
					LocalDate birthday = birthdayStr.isEmpty() ? null : LocalDate.parse(birthdayStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
					String photo = st.nextToken().trim();
					String description = st.nextToken().trim();
					Role role = Role.valueOf(st.nextToken().trim());
					boolean blocked = Boolean.parseBoolean(st.nextToken().trim());
					ArrayList<Integer> productsForSaleIds = parseIds(st.nextToken().trim());
					ArrayList<Integer> purchasedProductsIds = parseIds(st.nextToken().trim());
					ArrayList<Integer> reviewIds = parseIds(st.nextToken().trim());
					Double rate = Double.valueOf(st.nextToken().trim());
					boolean deleted = Boolean.parseBoolean(st.nextToken().trim());
					
					User user = new User(id, firstName, lastName, username, email, phone, password, 
							birthday, photo, description, role, blocked, productsForSaleIds, purchasedProductsIds, 
							reviewIds, rate, deleted);
					
					users.put(id,  user);

				}
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				}
				catch (Exception e) { }
			}
		}
	}
	
	private ArrayList<Integer> parseIds(String text) {
	    ArrayList<Integer> ids = new ArrayList<>();
	    if (!text.equals("-") && !text.isEmpty()) {
	        String[] parts = text.split(",");
	        for (String p : parts) {
	            ids.add(Integer.valueOf(p.trim()));
	        }
	    }
	    return ids;
	}
}
