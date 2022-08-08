package Inheritance;

public class person {
	protected String name;                                           ///   <--
	public person(String name) {                                     ///     |
		this.name=name;                                              ///     |
		System.out.println("Inside person Constructor");             ///     |
	}                                                                ///     |
	public void eat() {                                              ///     |
		System.out.println("Person " +name+" Is Eating!!");          ///     |    
	} 

}
