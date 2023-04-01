package learningSession1;

public class Car implements Vehicle {
	private int gear =1;
	private int speed = 0;
	//firstcommiit2
	public void changeGear(int gear) {
		
		this.gear = gear;
	}
	public void speedUp(int change) {
		this.speed += change;
	}
	public void slowDown(int change) {
		this.speed -= change;
	}
	
	public void display1() {
		System.out.println("The vehicle speed is " + this.speed + "km/h can be reduced to " + this.gear + " gear" );
		out();
	}
	 

}
