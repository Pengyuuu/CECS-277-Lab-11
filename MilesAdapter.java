
public class MilesAdapter extends KilometersAdaptee {
	
	private double speed;
	private double hours;
	
	public MilesAdapter(double speed, double hours) {
		
		this.speed = speed;
		this.hours = hours;
	}
	
	public double distance() {
		
		double kilometersSpeed = speed * 1.609;
		
		double kilometersDistance = distancek(kilometersSpeed, hours);
		
		return kilometersDistance / 1.609;
	}

}
