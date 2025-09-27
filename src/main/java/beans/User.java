package beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import beans.Product;
import beans.Review;
import enums.Role;

public class User{
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String phone;
	private String password;
	private LocalDate birthday;
	private String photo;
	private String description;
	private Role role;
	private boolean blocked;
	private ArrayList<Integer> productsForSaleIds;
	private ArrayList<Integer> purchasedProductsIds;
	private ArrayList<Integer> reviewIds;
	private double rate;
	private boolean deleted;
	
	public User() {
	}

	public User(int id, String firstName, String lastName, String username, String email, String phone, String password,
			LocalDate birthday, String photo, String description, Role role, boolean blocked,
			ArrayList<Integer> productsForSaleIds, ArrayList<Integer> purchasedProductsIds,
			ArrayList<Integer> reviewIds, double rate, boolean deleted) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.birthday = birthday;
		this.photo = photo;
		this.description = description;
		this.role = role;
		this.blocked = blocked;
		this.productsForSaleIds = productsForSaleIds;
		this.purchasedProductsIds = purchasedProductsIds;
		this.reviewIds = reviewIds;
		this.rate = rate;
		this.deleted = deleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public ArrayList<Integer> getProductsForSaleIds() {
		return productsForSaleIds;
	}

	public void setProductsForSaleIds(ArrayList<Integer> productsForSaleIds) {
		this.productsForSaleIds = productsForSaleIds;
	}

	public ArrayList<Integer> getPurchasedProductsIds() {
		return purchasedProductsIds;
	}

	public void setPurchasedProductsIds(ArrayList<Integer> purchasedProductsIds) {
		this.purchasedProductsIds = purchasedProductsIds;
	}

	public ArrayList<Integer> getReviewIds() {
		return reviewIds;
	}

	public void setReviewIds(ArrayList<Integer> reviewIds) {
		this.reviewIds = reviewIds;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthday, blocked, deleted, description, email, firstName, id, lastName, password, phone,
				photo, productsForSaleIds, purchasedProductsIds, rate, reviewIds, role, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(birthday, other.birthday) && blocked == other.blocked && deleted == other.deleted
				&& Objects.equals(description, other.description) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(photo, other.photo)
				&& Objects.equals(productsForSaleIds, other.productsForSaleIds)
				&& Objects.equals(purchasedProductsIds, other.purchasedProductsIds)
				&& Double.doubleToLongBits(rate) == Double.doubleToLongBits(other.rate)
				&& Objects.equals(reviewIds, other.reviewIds) && role == other.role
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", email=" + email + ", phone=" + phone + ", password=" + password + ", birthday=" + birthday
				+ ", photo=" + photo + ", description=" + description + ", role=" + role + ", blocked=" + blocked
				+ ", productsForSaleIds=" + productsForSaleIds + ", purchasedProductsIds=" + purchasedProductsIds
				+ ", reviewIds=" + reviewIds + ", rate=" + rate + ", deleted=" + deleted + "]";
	}
	

	
}
