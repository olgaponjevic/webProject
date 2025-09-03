package beans;
import beans.Location;
import beans.Offer;
import beans.User;
import enums.SaleStatus;
import enums.SaleType;

import java.util.ArrayList;

import beans.Category;

public class Product {
	private String id;
	private String name;
	private String description;
	private String photo;
	private Category category;
	private double price;
	private SaleType saleType;
	private String published;
	private ArrayList<Offer> offer;
	private Integer salesmanId;
	private User salesman;
	private boolean customerReview;
	private boolean salesmanReview;
	private SaleStatus status;
	private Location location;
	
	
	public Product() {
		
	}

	public Product(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setId(String i) {
		id = i;
	}

	public String getId() {
		return id;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double p) {
		price = p;
	}

	public double getPrice() {
		return price;
	}

}
