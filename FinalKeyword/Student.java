package FinalKeyword;

public final class Student {
	final int ROLL_NO;
	final String name;
	{
		ROLL_NO = 4;
	}
	public Student() {
		name = "Anuj";
		
	}
	public final void getDescription() {
		System.out.println("The Student name is: "+name);
	}
	
}
