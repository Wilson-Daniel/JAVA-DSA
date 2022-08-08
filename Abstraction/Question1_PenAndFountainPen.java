package Abstraction;

abstract class Pen{
	abstract void write();
	abstract void refill();
	
}

class FountainPen extends Pen{
	public void write() {
		System.out.println("Writing....");
	}
	public void refill() {
		System.out.println("Refilling...");
	}
	public void changeNib() {
		System.out.println("Changing Nib...");
	}
}
//---> Question 2
class Monkey{
	void jump() {
		System.out.println("Jumping..");
	}
	void bite() {
		System.out.println("Biting...");
	}
}
//---
interface BaseAnimal{
	void eat();
	void sleep();
	private void greet() {
		System.out.println("Greetings..");
	}
	default void good() {
		greet();
		System.out.println("Good Morning...");
	}
}
//---
class Human extends Monkey implements BaseAnimal{
	public void eat() {
		System.out.println("Eating");
	}
	public void sleep() {
		System.out.println("Sleeping");
	}
	public void walk() {
		System.out.println("Walking.....");
	}
}

public class Question1_PenAndFountainPen {

	public static void main(String[] args) {
//		FountainPen pen = new FountainPen();
//		pen.write();
//		pen.refill();
//		pen.changeNib();
//		Human h = new Human();
//		h.bite();
//		h.eat();
//		h.jump();
//		h.walk();
//		h.good();
//		h.sleep();
		Monkey m = new Human();
		m.bite();
		m.jump();
		BaseAnimal lovish = new Human();
		lovish.eat();
		lovish.sleep();
		
	}

}
