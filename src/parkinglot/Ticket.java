package parkinglot;

import java.time.LocalDateTime;

public class Ticket {
	
	
	String ticketNumber;
	LocalDateTime startTime;
	LocalDateTime endTime;
	ParkingSlot parkingSlot;
	  Vehicle vehicle;
	Double price;
	
	
	
	public Ticket() {
		super();
	}



	public Ticket(String ticketNumber, LocalDateTime startTime, LocalDateTime endTime, ParkingSlot parkingSlot,
			Double price) {
		
		this.ticketNumber = ticketNumber;
		this.startTime = startTime;
		this.endTime = endTime;
		this.parkingSlot = parkingSlot;
		this.price = price;
	}
	
	
	
  public  Ticket createTicket( ParkingSlot parkingSlot,Vehicle vehicle ) {
	 
	  
	 this.parkingSlot=parkingSlot;
	 this.startTime=LocalDateTime.now();
	 this.endTime=LocalDateTime.now();
	 this.vehicle=vehicle;
	 this.ticketNumber=vehicle.getVehicleNumber()+System.currentTimeMillis();
	 
	 return this;
	  
  }



public String getTicketNumber() {
	return ticketNumber;
}



public void setTicketNumber(String ticketNumber) {
	this.ticketNumber = ticketNumber;
}



public LocalDateTime getStartTime() {
	return startTime;
}



public void setStartTime(LocalDateTime startTime) {
	this.startTime = startTime;
}



public LocalDateTime getEndTime() {
	return endTime;
}



public void setEndTime(LocalDateTime endTime) {
	this.endTime = endTime;
}



public ParkingSlot getParkingSlot() {
	return parkingSlot;
}



public void setParkingSlot(ParkingSlot parkingSlot) {
	this.parkingSlot = parkingSlot;
}



public Vehicle getVehicle() {
	return vehicle;
}



public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}



public Double getPrice() {
	return price;
}



public void setPrice(Double price) {
	this.price = price;
}
	
  
  
	
	
}
