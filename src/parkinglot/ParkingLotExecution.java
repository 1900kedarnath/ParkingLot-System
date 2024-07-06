package parkinglot;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotExecution {
	
	
	
	public static void main(String [] arg) {
		
		   String nameOfParkingLot ="Zebra Parking Lot";
	        Address address = new Address("Bangalore","India","KA");
	        Map<ParkingSlotType, Map<String,ParkingSlot>>  allSlots = new HashMap<>();
	        Map<String,ParkingSlot> compactSlot =new HashMap<>();
	        compactSlot.put("C1",new ParkingSlot("C1",ParkingSlotType.compact));
	        compactSlot.put("C2",new ParkingSlot("C2",ParkingSlotType.compact));
	        compactSlot.put("C3",new ParkingSlot("C3",ParkingSlotType.compact));
	        allSlots.put(ParkingSlotType.compact,compactSlot);
	        
	        Map<String,ParkingSlot> largeSlot = new HashMap<>();
	        largeSlot.put("L1",new ParkingSlot("L1",ParkingSlotType.large));
	        largeSlot.put("L2",new ParkingSlot("L2",ParkingSlotType.large));
	        largeSlot.put("L3",new ParkingSlot("L3",ParkingSlotType.large));
	        allSlots.put(ParkingSlotType.large,largeSlot);
	        
	        Map<String,ParkingSlot> twoWheelerSlot = new HashMap<>();
	        twoWheelerSlot.put("B1",new ParkingSlot("B1",ParkingSlotType.TwoWheeler));
	        twoWheelerSlot.put("B2",new ParkingSlot("B2",ParkingSlotType.TwoWheeler));
	        twoWheelerSlot.put("B3",new ParkingSlot("B3",ParkingSlotType.TwoWheeler));
	        allSlots.put(ParkingSlotType.TwoWheeler, twoWheelerSlot);
	        
	        
	        ParkingFloor parkingFloor1=new  ParkingFloor("1",allSlots) ; 
	        ParkingFloor parkingFloor2=new  ParkingFloor("2",allSlots) ;
	        ParkingFloor parkingFloor3=new  ParkingFloor("3",allSlots) ;

	        List< ParkingFloor> parkingFloor=new ArrayList<>();
	        parkingFloor.add(parkingFloor1);
	        parkingFloor.add(parkingFloor2);
	        parkingFloor.add(parkingFloor3);
	        
	        ParkingLot parkingLot=new ParkingLot(nameOfParkingLot,address,parkingFloor);
	        
	        
	        Vehicle vehicle = new Vehicle();
	        vehicle.setVehicleCategory(VehicleCategory.twowheeler);
	        vehicle.setVehicleNumber("KA-01-MA-9999");
		
	        Ticket ticket = parkingLot.ticketWindow(vehicle);
	        System.out.println(" ticket number >> "+ticket.getTicketNumber());
	        //persist the ticket to db here
	        try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        double price = parkingLot.scanAndPay(ticket);
	        System.out.println("price is >>" + price);
	        
	}

}
