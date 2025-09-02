package beans;


public class Location {
	private int id;
	private double latitude;
	private double longitude;
	private String adress;

	public Location() {
	}
	
	public String stringForFile() {
		return id + "|" + latitude + "|" + longitude + "|" + adress;
				
	}

	public Location(int id, double longitude, double latitude, String adress) {
		super();
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
