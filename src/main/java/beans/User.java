package beans;

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
	private String birthday;
	private String photo;
	private String description;
	private Role role;
	private boolean blocked;
	private ArrayList<Integer> productsForSaleIds;
	private ArrayList<Product> productsForSale;
	private ArrayList<Integer> purchasedProductsIds;
	private ArrayList<Product> purchasedProducts;
	private ArrayList<Integer> reviewIds;
	private ArrayList<Review> reviews;
	private double rate;
	
	public User() {
	}

	

	public User(int id, String firstName, String lastName, String username, String email, String phone, String password,
			String birthday, String photo, String description, Role role, boolean blocked,
			ArrayList<Integer> productsForSaleIds, ArrayList<Product> productsForSale,
			ArrayList<Integer> purchasedProductsIds, ArrayList<Product> purchasedProducts, ArrayList<Integer> reviewIds,
			ArrayList<Review> reviews, double rate) {
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
		this.productsForSale = productsForSale;
		this.purchasedProductsIds = purchasedProductsIds;
		this.purchasedProducts = purchasedProducts;
		this.reviewIds = reviewIds;
		this.reviews = reviews;
		this.rate = rate;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
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



	public ArrayList<Product> getProductsForSale() {
		return productsForSale;
	}



	public void setProductsForSale(ArrayList<Product> productsForSale) {
		this.productsForSale = productsForSale;
	}



	public ArrayList<Integer> getPurchasedProductsIds() {
		return purchasedProductsIds;
	}



	public void setPurchasedProductsIds(ArrayList<Integer> purchasedProductsIds) {
		this.purchasedProductsIds = purchasedProductsIds;
	}



	public ArrayList<Product> getPurchasedProducts() {
		return purchasedProducts;
	}



	public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {
		this.purchasedProducts = purchasedProducts;
	}



	public ArrayList<Integer> getReviewIds() {
		return reviewIds;
	}



	public void setReviewIds(ArrayList<Integer> reviewIds) {
		this.reviewIds = reviewIds;
	}



	public ArrayList<Review> getReviews() {
		return reviews;
	}



	public void setReviews(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}



	public double getRate() {
		return rate;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}



	@Override
	public int hashCode() {
		return Objects.hash(birthday, blocked, description, email, firstName, id, lastName, password, phone, photo,
				productsForSale, productsForSaleIds, purchasedProducts, purchasedProductsIds, rate, reviewIds, reviews,
				role, username);
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
		return Objects.equals(birthday, other.birthday) && blocked == other.blocked
				&& Objects.equals(description, other.description) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(photo, other.photo)
				&& Objects.equals(productsForSale, other.productsForSale)
				&& Objects.equals(productsForSaleIds, other.productsForSaleIds)
				&& Objects.equals(purchasedProducts, other.purchasedProducts)
				&& Objects.equals(purchasedProductsIds, other.purchasedProductsIds)
				&& Double.doubleToLongBits(rate) == Double.doubleToLongBits(other.rate)
				&& Objects.equals(reviewIds, other.reviewIds) && Objects.equals(reviews, other.reviews)
				&& role == other.role && Objects.equals(username, other.username);
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", email=" + email + ", phone=" + phone + ", password=" + password + ", birthday=" + birthday
				+ ", photo=" + photo + ", description=" + description + ", role=" + role + ", blocked=" + blocked
				+ ", productsForSaleIds=" + productsForSaleIds + ", productsForSale=" + productsForSale
				+ ", purchasedProductsIds=" + purchasedProductsIds + ", purchasedProducts=" + purchasedProducts
				+ ", reviewIds=" + reviewIds + ", reviews=" + reviews + ", rate=" + rate + "]";
	}




}
