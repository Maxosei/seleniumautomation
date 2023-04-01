package learningSession1;

public class Cat extends Dog{
	private int food;
	public Cat(String name, int age, int food) {

		super(name , age);
		this.food = food;
		
	}
	//cat is a subclass of Dog so Dog is the superclass
public void speak() {
	System.out.println("I am " +this.name+ "and I am " + "I am " +this.age + "years old and i get fed" + this.food );
}
}
