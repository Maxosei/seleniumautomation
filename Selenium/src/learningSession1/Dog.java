package learningSession1;

public class Dog {
	protected String name;
	protected int age;
protected static int count = 0;//changes are possible
public static void display() {
	System.out.println("I am a footballer");
}
public static  void display2() {
	System.out.println("I am a dancer");
}
	public Dog(String name, int age) {
		this.age = age;
		this.name = name;
		add();
		speak();
		Dog.count +=1;
		Dog.display2();
	}//created object
	
	public void speak() {
		System.out.println("i am " + this.name + " and I am " + this.age +" years old" );
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public int add() {
		return this.age;
	}
	
}
