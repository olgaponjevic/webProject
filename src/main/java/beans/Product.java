package beans;
import beans.Location;

public class Product {
	private String id;
	private String name;
	private String photo;
	private String category;
	private double price;
	private String saleType;
	private String published;
	private String offer;
	private String salesman;
	private boolean customerReview;
	private boolean salesmanReview;
	private String status;
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
