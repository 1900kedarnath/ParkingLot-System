package parkinglot;

public class Address {

	
	
	String city;
	String country;
	String State;
	
	
	
	
	
	public Address(String city, String country, String state) {
		super();
		this.city = city;
		this.country = country;
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	
	
	
}
