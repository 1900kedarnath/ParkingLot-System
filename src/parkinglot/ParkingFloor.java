package parkinglot;

import java.util.Map;

public class ParkingFloor {
	
	
	private String name;
	private Map<ParkingSlotType,Map<String,ParkingSlot>> parkingSlot;
	
	
	
	public ParkingFloor(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlot) {
		super();
		this.name = name;
		this.parkingSlot = parkingSlot;
	}
	
	public ParkingSlot getRelevantParkingSlot(Vehicle vehicle) {
		
		VehicleCategory vehicleCategory=vehicle.getVehicleCategory() ;
		ParkingSlotType parkingSlotType=pickCorrectParkingSlot( vehicleCategory);
		 Map<String,ParkingSlot> relevantParkingSlot=parkingSlot.get(parkingSlotType);
		 
		 ParkingSlot slot=new ParkingSlot();
		 
		 for(Map.Entry<String, ParkingSlot> i:relevantParkingSlot.entrySet()) {
			 
			 if(i.getValue().isAvailable()) {
				 slot=i.getValue();
				 slot.addVehicle(vehicle);
				 break;
			 }
			 
		 }
		 
		return slot;
	}
	
	
	private ParkingSlotType pickCorrectParkingSlot(VehicleCategory vehicleCategory) {
		
		if(vehicleCategory.equals(VehicleCategory.twowheeler))
			return ParkingSlotType.TwoWheeler;
		else if(vehicleCategory.equals(VehicleCategory.fourWheeler))
			return ParkingSlotType.medium;
		else if(vehicleCategory.equals(VehicleCategory.bus))
			return ParkingSlotType.large;
		return null;
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<ParkingSlotType, Map<String, ParkingSlot>> getParkingSlot() {
		return parkingSlot;
	}
	public void setParkingSlot(Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlot) {
		this.parkingSlot = parkingSlot;
	}
	
	
	

}
