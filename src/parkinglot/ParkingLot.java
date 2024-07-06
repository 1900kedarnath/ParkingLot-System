package parkinglot;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ParkingLot {

	String name;
	Address address;
	List<ParkingFloor> parkingFloor;
	
	
	
	
	ParkingLot(String name,Address address,List<ParkingFloor> parkingFloor){
		
		this.name=name;
		this.address=address;
		this.parkingFloor=parkingFloor;
		
		
	}
	
	public void addFloor(String floorName,Map<ParkingSlotType,Map<String,ParkingSlot>> parkingSlot) {
		
	 ParkingFloor pf=new ParkingFloor(floorName,parkingSlot)	;
	 
	 parkingFloor.add(pf);
		
		
		
	}
	
	public void removeFloor(String floorName) {
	
		parkingFloor.stream().forEach(a->
		
		{
		if(a.getName().equals(floorName))
			parkingFloor.remove(a);
		}
				);
		
		 
	}
	
	public Ticket ticketWindow(Vehicle vehicle) {
		
      ParkingSlot parkingSlot=getParkingSlotForVehicleAndPark(vehicle);		
		
      Ticket ticket=new Ticket();
		if(parkingSlot==null)
			return null;
		
		 return  ticket.createTicket(parkingSlot, vehicle);
		
		
		
		
		
	}
	
	 public double scanAndPay(Ticket ticket){
	        long endTime = System.currentTimeMillis();
	       // ticket.getParkingSlot().removeVehicle(ticket.getVehicle());
	        int duration = (int) (ticket.getStartTime().getSecond())/1000;
	        
	        double price = ticket.getParkingSlot().getParkingSlotType().getPriceForParking(duration);
	        //persist record to database
	        return price;
	    }

	
	public ParkingSlot getParkingSlotForVehicleAndPark(Vehicle vehicle) {
		
		 ParkingSlot  parkingSlot=null;
		
		for(ParkingFloor  ParkingFloor1:parkingFloor)
		{
			
			if(ParkingFloor1.getRelevantParkingSlot(vehicle)!=null) {
				parkingSlot=ParkingFloor1.getRelevantParkingSlot(vehicle);
				break;
			}
		}
		
				
				
		
		
		return parkingSlot;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<ParkingFloor> getParkingFloor() {
		return parkingFloor;
	}
	public void setParkingFloor(List<ParkingFloor> parkingFloor) {
		this.parkingFloor = parkingFloor;
	}
	
	
	
	
	
}
