package beans;
import java.util.Objects;

import beans.User;

public class Offer {
	private int id;
	private double price;
	private Integer customerId;
	private User customer;
	
	public Offer() {
		super();
	}

	public Offer(int id, double price, Integer customerId, User customer) {
		super();
		this.id = id;
		this.price = price;
		this.customerId = customerId;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, customerId, id, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Offer other = (Offer) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(customerId, other.customerId)
				&& id == other.id && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", price=" + price + ", customerId=" + customerId + ", customer=" + customer + "]";
	}
	
	

}
