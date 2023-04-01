package learningSession1;

public interface Vehicle {
 //completely abstract useful for inheritance and not an instance
	final int gears = 5;//final cannot change
	
	void speedUp(int a);
	void slowDown(int a);
	void changeGear(int a);
	
	default void out() {
		System.out.println("default Method");
	}
}
