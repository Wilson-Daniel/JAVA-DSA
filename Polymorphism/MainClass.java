package Polymorphism;

public class MainClass {

	public static void main(String[] args) {
//		Dog d = new Dog();
//		
//		Pet p = d;
//		Animal a = d;
//		
//		d.walk();
//		p.walk(); ///RUN-TIME POLYMORPHISM
		greetings();///COMPILE TIME POLYMORPHISM
		greetings("Good Morning",3);
		greetings("Wilson Good Morning");
	}
	public static void greetings() {
		System.out.println("Hi,there");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}
	public static void greetings(String s , int count ) {
		for(int i=0 ; i<count ; i++) {
			System.out.println(s);
		}
		
				
	}
	

}
