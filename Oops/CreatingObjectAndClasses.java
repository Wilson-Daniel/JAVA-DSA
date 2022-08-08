package Oops;

//class Dog{
//	String name , breed ;
//	public void jump() {
//		System.out.println("My Dog "+name + " Jumped ");
//	}
//	public void discription() {
//		System.out.println("My Dog Name Is "+ name + " & It's Breed Is "+ breed );
//	}
//	
//}
class Cat{
	boolean hasFur;
	String Color , breed;
	int Legs , eyes;
	public void eat() {
		System.out.println("Cat Is Eating");
	}
	public void walk() {
		System.out.println("Cat Is Walking");
	}
	
}

public class CreatingObjectAndClasses {
	

	public static void main(String[] args) {
//		Dog dog1 = new Dog();
//		Dog dog2 = new Dog();
//		
//		dog1.breed = "Husky";
//		dog2.breed = "Browny";
//		
//		dog1.name = "Poodle";
//		dog2.name = "Mr.MoolChand Jii";
//		
//		dog1.jump();
//		dog1.discription();
//		
//		dog2.jump();
//		dog2.discription();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.eat();
		cat2.eat();
	    
	}

}
