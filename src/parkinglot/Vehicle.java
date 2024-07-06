package parkinglot;

public class Vehicle {

	private String name;
	private VehicleCategory  vehicleCategory;
	private String vehicleNumber;
	 
	
	
	 public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String string) {
		this.vehicleNumber = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public VehicleCategory getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(VehicleCategory vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	
	
	 
	 
}
