package parkinglot;

public enum ParkingSlotType {
	
	
	TwoWheeler {public double getPriceForParking(long duration){
        return duration*0.05;
    }},
	compact{ public double getPriceForParking(long duration){
        return duration*0.075;
    } },
	large{ public double getPriceForParking(long duration){
        return duration*0.09;
    }},
	medium{ public double getPriceForParking(long duration){
        return duration*0.10;
    }};
    public abstract double getPriceForParking(long duration);

}
