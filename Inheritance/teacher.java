package Inheritance;

public class teacher extends person {
	public teacher(String name){                                     ///     |
		super(name); ////CONTRUCTOR CALL SHOULD BE IN EVERY CHILD CLASS------^
		System.out.println("Inside teacher Constructor");
	}
	public void eat() {
		super.eat();
		System.out.println("Teacher "+name+ " Is Eating!!");
	}

}
