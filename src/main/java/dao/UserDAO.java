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
/***
 * <p>Klasa namenjena da ucita korisnike iz fajla i pruza operacije nad njima (poput pretrage).
 * Korisnici se nalaze u fajlu WebContent/users.txt u obliku: <br>
 * firstName;lastName;email;username;password</p>
 * <p><b>NAPOMENA:</b> Lozinke se u praksi <b>nikada</b> ne snimaju u istom tekstualnom obliku.</p>
 * 
 *
 */
public class UserDAO {
	
	private Map<String, User> users = new HashMap<>();
	
	
	public UserDAO() {
		
	}
	
	/***
	 * @param contextPath Putanja do aplikacije u Tomcatu. Moze se pristupiti samo iz servleta.
	 */
	public UserDAO(String contextPath) {
		loadUsers(contextPath);
	}
	
	/**
	 * Vraca korisnika za prosledjeno korisnicko ime i sifru. Vraca null ako korisnik ne postoji
	 * @param username
	 * @param password
	 * @return
	 */
	public User find(String username, String password) {
		if (!users.containsKey(username)) {
			return null;
		}
		User user = users.get(username);
		if (!user.getPassword().equals(password)) {
			return null;
		}
		return user;
	}
	
	public Collection<User> findAll() {
		return users.values();
	}
	
	/**
	 * Ucitava korisnike iz WebContent/users.txt fajla i dodaje ih u mapu {@link #users}.
	 * Kljuc je korisnicko ime korisnika.
	 * @param contextPath Putanja do aplikacije u Tomcatu
	 */
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
					int id = Integer.valueOf(st.nextToken().trim());
					String firstName = st.nextToken().trim();
					String lastName = st.nextToken().trim();
					String username = st.nextToken().trim();
					String email = st.nextToken().trim();
					String phone = st.nextToken().trim();
					String password = st.nextToken().trim();
					String birthday = st.nextToken().trim();
					String photo = st.nextToken().trim();
					String description = st.nextToken().trim();
					Role role = Role.valueOf(st.nextToken().trim());
					boolean blocked = Boolean.parseBoolean(st.nextToken().trim());
					
					String[] productsForSaleIds;
					ArrayList<Integer> productsForSaleIdsInt = new ArrayList<Integer>();
					String productsString = st.nextToken().trim();
					if(!productsString.equals("-")) {
						productsForSaleIds = productsString.split(",");
						for(String productsForSaleId:productsForSaleIds) {
							Integer pId = Integer.valueOf(productsForSaleId);
							productsForSaleIdsInt.add(pId);
						}
					} 
					
					String[] purchasedProductsIds;
					ArrayList<Integer> purchasedProductsIdsInt = new ArrayList<Integer>();
					String purchasedString = st.nextToken().trim();
					if(!purchasedString.equals("-")) {
						purchasedProductsIds = purchasedString.split(",");
						for(String purchasedProductsId:purchasedProductsIds) {
							Integer prId = Integer.valueOf(purchasedProductsId);
							purchasedProductsIdsInt.add(prId);
						}
					} 
					
					String[] reviewIds;
					ArrayList<Integer> reviewIdsInt = new ArrayList<Integer>();
					String reviewString = st.nextToken().trim();
					if(!reviewString.equals("-")) {
						reviewIds = reviewString.split(",");
						for(String reviewId:reviewIds) {
							Integer rId = Integer.valueOf(reviewId);
							reviewIdsInt.add(rId);
						}
					} 
					Double rate = Double.valueOf(st.nextToken().trim());


					users.put(username, new User(id, firstName, lastName, username, email, phone, password,
							birthday, photo, description, role, blocked, productsForSaleIdsInt, new ArrayList<Product>(),
							purchasedProductsIdsInt,  new ArrayList<Product> (), reviewIdsInt,
							new ArrayList<Review>(), rate));
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
}
