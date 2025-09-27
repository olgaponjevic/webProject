package beans;
import beans.Location;
import beans.Offer;
import beans.User;
import enums.SaleStatus;
import enums.SaleType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

import beans.Category;

public class Product {
	private int id;
	private String name;
	private String description;
	private String photo;
	private int categoryId;
	private double price;
	private SaleType saleType;
	private LocalDateTime published;
	private ArrayList<Integer> offerIds;
	private int salesmanId;
	private boolean customerReview;
	private boolean salesmanReview;
	private SaleStatus status;
	private int locationId;
	private boolean deleted;
	
	public Product() {
	}

	public Product(int id, String name, String description, String photo, int categoryId, double price,
			SaleType saleType, LocalDateTime published, ArrayList<Integer> offerIds, int salesmanId,
			boolean customerReview, boolean salesmanReview, SaleStatus status, int locationId, boolean deleted) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.photo = photo;
		this.categoryId = categoryId;
		this.price = price;
		this.saleType = saleType;
		this.published = published;
		this.offerIds = offerIds;
		this.salesmanId = salesmanId;
		this.customerReview = customerReview;
		this.salesmanReview = salesmanReview;
		this.status = status;
		this.locationId = locationId;
		this.deleted = deleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

	public LocalDateTime getPublished() {
		return published;
	}

	public void setPublished(LocalDateTime published) {
		this.published = published;
	}

	public ArrayList<Integer> getOfferIds() {
		return offerIds;
	}

	public void setOfferIds(ArrayList<Integer> offerIds) {
		this.offerIds = offerIds;
	}

	public int getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
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

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryId, customerReview, deleted, description, id, locationId, name, offerIds, photo,
				price, published, saleType, salesmanId, salesmanReview, status);
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
		return categoryId == other.categoryId && customerReview == other.customerReview && deleted == other.deleted
				&& Objects.equals(description, other.description) && id == other.id && locationId == other.locationId
				&& Objects.equals(name, other.name) && Objects.equals(offerIds, other.offerIds)
				&& Objects.equals(photo, other.photo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(published, other.published) && saleType == other.saleType
				&& salesmanId == other.salesmanId && salesmanReview == other.salesmanReview && status == other.status;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", photo=" + photo
				+ ", categoryId=" + categoryId + ", price=" + price + ", saleType=" + saleType + ", published="
				+ published + ", offerIds=" + offerIds + ", salesmanId=" + salesmanId + ", customerReview="
				+ customerReview + ", salesmanReview=" + salesmanReview + ", status=" + status + ", locationId="
				+ locationId + ", deleted=" + deleted + "]";
	}

	

}
