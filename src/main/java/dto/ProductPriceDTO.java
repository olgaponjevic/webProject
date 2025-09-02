package dto;

public class ProductPriceDTO {
	private String id;
	private double price;
	
	public ProductPriceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductPriceDTO(String id, double price) {
		super();
		this.id = id;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
