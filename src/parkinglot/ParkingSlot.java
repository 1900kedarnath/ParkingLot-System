package parkinglot;

public class ParkingSlot {
	
	String name;
	boolean isAvailable;
	ParkingSlotType parkingSlotType;
	Vehicle vehicle;
	
	
	
	
	
	public ParkingSlot() {
		super();
	}

	public ParkingSlot(String name, ParkingSlotType parkingSlotType) {
		super();
		this.name = name;
		this.parkingSlotType = parkingSlotType;
	}

	public void addVehicle(Vehicle vehicle) {
		this.vehicle=vehicle;
		this.isAvailable=false;
		
	}
	
	public void removeVehicle(Vehicle vehicle) {
		
		this.isAvailable=true;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public ParkingSlotType getParkingSlotType() {
		return parkingSlotType;
	}
	public void setParkingSlotType(ParkingSlotType parkingSlotType) {
		this.parkingSlotType = parkingSlotType;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	

}
