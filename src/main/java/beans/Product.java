package beans;
import beans.Location;
import beans.Offer;
import beans.User;
import enums.SaleStatus;
import enums.SaleType;

import java.util.ArrayList;
import java.util.Objects;

import beans.Category;

public class Product {
	private String id;
	private String name;
	private String description;
	private String photo;
	private Integer categoryId;
	private Category category;
	private double price;
	private SaleType saleType;
	private String published;
	private ArrayList<Integer> offerIds;
	private ArrayList<Offer> offer;
	private Integer salesmanId;
	private User salesman;
	private boolean customerReview;
	private boolean salesmanReview;
	private SaleStatus status;
	private Integer locationId;
	private Location location;
	
	
	public Product() {
		
	}


	public Product(String id, String name, String description, String photo, Integer categoryId, Category category,
			double price, SaleType saleType, String published, ArrayList<Integer> offerIds, ArrayList<Offer> offer, Integer salesmanId,
			User salesman, boolean customerReview, boolean salesmanReview, SaleStatus status, Integer locationId,
			Location location) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.photo = photo;
		this.categoryId = categoryId;
		this.category = category;
		this.price = price;
		this.saleType = saleType;
		this.published = published;
		this.offerIds = offerIds;
		this.offer = offer;
		this.salesmanId = salesmanId;
		this.salesman = salesman;
		this.customerReview = customerReview;
		this.salesmanReview = salesmanReview;
		this.status = status;
		this.locationId = locationId;
		this.location = location;
	}




	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public SaleType getSaleType() {
		return saleType;
	}


	public void setSaleType(SaleType saleType) {
		this.saleType = saleType;
	}


	public String getPublished() {
		return published;
	}


	public void setPublished(String published) {
		this.published = published;
	}


	public ArrayList<Integer> getOfferIds() {
		return offerIds;
	}


	public void setOfferIds(ArrayList<Integer> offerIds) {
		this.offerIds = offerIds;
	}


	public ArrayList<Offer> getOffer() {
		return offer;
	}


	public void setOffer(ArrayList<Offer> offer) {
		this.offer = offer;
	}


	public Integer getSalesmanId() {
		return salesmanId;
	}


	public void setSalesmanId(Integer salesmanId) {
		this.salesmanId = salesmanId;
	}


	public User getSalesman() {
		return salesman;
	}


	public void setSalesman(User salesman) {
		this.salesman = salesman;
	}


	public boolean isCustomerReview() {
		return customerReview;
	}


	public void setCustomerReview(boolean customerReview) {
		this.customerReview = customerReview;
	}


	public boolean isSalesmanReview() {
		return salesmanReview;
	}


	public void setSalesmanReview(boolean salesmanReview) {
		this.salesmanReview = salesmanReview;
	}


	public SaleStatus getStatus() {
		return status;
	}


	public void setStatus(SaleStatus status) {
		this.status = status;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public Integer getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}


	public Integer getLocationId() {
		return locationId;
	}


	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(category, categoryId, customerReview, description, id, location, locationId, name, offer,
				photo, price, published, saleType, salesman, salesmanId, salesmanReview, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(categoryId, other.categoryId)
				&& customerReview == other.customerReview && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(location, other.location)
				&& Objects.equals(locationId, other.locationId) && Objects.equals(name, other.name)
				&& Objects.equals(offer, other.offer) && Objects.equals(photo, other.photo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(published, other.published) && saleType == other.saleType
				&& Objects.equals(salesman, other.salesman) && Objects.equals(salesmanId, other.salesmanId)
				&& salesmanReview == other.salesmanReview && status == other.status;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", photo=" + photo
				+ ", categoryId=" + categoryId + ", category=" + category + ", price=" + price + ", saleType="
				+ saleType + ", published=" + published + ", offer=" + offer + ", salesmanId=" + salesmanId
				+ ", salesman=" + salesman + ", customerReview=" + customerReview + ", salesmanReview=" + salesmanReview
				+ ", status=" + status + ", locationId=" + locationId + ", location=" + location + "]";
	}



}
