package learningSession1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> t = new HashSet<Integer>();//arranges our array
		
		t.add(5);
		t.add(7);
		t.add(3);
		t.add(6);
		t.add(9);
		
		t.remove(9);
		t.size();
		
		int x = t.size();//number of elements in the array
		
		System.out.println(x);
		System.out.println(t);
		
		
		ArrayList<Integer> t2 = new ArrayList<Integer>();//not arranged array
		
		t2.add(2);
		t2.add(6);
		t2.add(1);
		t2.add(10);
		t2.set(1, 25);//change the element at the index
		t2.subList(1, 3);
		
		
		
		System.out.println(t2);
		System.out.println(t2.subList(1, 3));
		
		//findout about LinkedList
		 
		Map t3 = new HashMap();//contains unique keys but can contain same value not sorted
		
		t3.put("tim", 5);
		t3.put("joe", 3);
		 ;
		
		t3.containsValue("b");//false
		t3.containsKey(5);//true
		
		t3.isEmpty();
		
	
		
		System.out.println(t3);
		
Map t4 = new TreeMap();//sorts the unique ids and values
		
		t4.put("tim", 5);
		t4.put("joe", 3);
		t4.put("prince", "arthur");
		
		System.out.println(t4);
		
//LinkedHashMap maintains the order you start your list	
		
		Map m = new HashMap();
		
		String str = "My name is Prince Arthur";
		
		for(char i:str.toCharArray()) {;
			if(m.containsKey(x)) {
				int old = (int) m.get(x);
				m.put(x, old+1);
				
			}else{
				m.put(x, 1);
			};
			

			
	}
		m.remove(' ');
		System.out.println(m);
		
		int [] x2 = {-99, 3, 5 , 2, 4, 6, 1};
		Arrays.sort(x2, 1,5);//sorts the array in the range given
		
		for(int i:x2) {
			System.out.println(i + ",");
		};
		
		time1();//call the method
	}
	public static void time1(){
		System.out.println("the time is changing");
		System.out.println(str("hi"));//called the method here
		Dog tim = new Dog("Tim", 4);
		tim.speak();
		Dog samuel = new Dog("Samuel", 4);
		samuel.speak();
		Dog frank = new Dog("Frank", 5);
		frank.speak();
		int x = tim.getAge();
		System.out.println(x);
		tim.setAge(10);
		tim.speak();
		tim.add();
		Cat tim2 = new Cat("Tim3", 15, 100);
		tim2.speak();
		Dog tim3 = new Dog("Bill", 10);
		System.out.println(Dog.count);
		Game  joe = new Game("bill");
		Game bill = new Game("bill");
		Game fred = new Game("fred");
		System.out.println(joe.equals(bill));// compare the values
		System.out.println(joe.compareTo(bill));
		System.out.println(joe.compareTo(fred));
		System.out.println(bill);
		OuterClass out = new OuterClass();
		out.inner();
		System.out.println("----------------");
		Car ford = new Car();
		ford.speedUp(10);
		ford.changeGear(2);
		ford.display1(); 
		System.out.println("----------------");
		Level lvl = Level.LOW;
		Level[] arr = Level.values();
		
		for(Level e : arr) {
			System.out.println(e);
		}
		
		//to convert to String en = lvl.toString();
		//System.out.println(Level.values());//memory value
		
		if(lvl == Level.LOW) {
			System.out.println(lvl);
		}else if(lvl == Level.MEDIUM) {
			System.out.println(lvl);
		}else {
			System.out.println(lvl);
		}
		System.out.println(lvl.getLvl());//returns us an integer
		System.out.println(lvl.valueOf("LOW"));
		
		lvl.setLvl(3);
		
		System.out.println(lvl.getLvl());
	
	}
	


	
	
	public static String str(String s) {
		return s +"!";
	
	}//method and calling them
	
	
	
}
