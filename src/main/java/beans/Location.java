package beans;

import java.util.Objects;

public class Location {
	private int id;
	private double latitude;
	private double longitude;
	private String street;
	private String city;
	private String postalCode;

	public Location() {
	}

	public Location(int id, double latitude, double longitude, String street, String city, String postalCode) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, id, latitude, longitude, postalCode, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return Objects.equals(city, other.city) && id == other.id
				&& Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(postalCode, other.postalCode) && Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", street=" + street
				+ ", city=" + city + ", postalCode=" + postalCode + "]";
	}
	
	
	
}
