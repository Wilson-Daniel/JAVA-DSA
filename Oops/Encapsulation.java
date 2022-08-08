package Oops;
///GETTER AND SETTER METHODE
public class Encapsulation {
	private int age ; 
	private String name;
	
	public int gatAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>20) {
			System.out.println("You Are Not ELIGIBLE!!");
		}else {
			this.age=age;
		}
	}

	public static void main(String[] args) {
		Encapsulation student = new Encapsulation();
		student.age=18;
	}
}

