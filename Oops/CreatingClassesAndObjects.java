package Oops;

import java.util.Scanner;

class Vehicle{  ///CLASS
	int wheels;
	int headlights;
	String color;
	
	Vehicle(int wheels,int lights,String colors){///-----CONSTRUCTOR
		System.out.println("Its A Nice Car");
		this.wheels = wheels;
		color = colors;
		headlights = lights;
	}
///----METHODS SECTION	
	public void drive() {///METHODS
		System.out.println("BMW is Moving!! ");
	}
	public void fuling() {///METHODS
		System.out.println("FUEL Empty Hurry UP , Need Fuel!!");	
	}
	public void info() {
		System.out.println("No. of WHEELS: " + wheels);
		System.out.println("No. of HEADLAMPS: "+ headlights);
		System.out.println("COLOR of BMW: "+ color);
	}
	
///----METHODS SECTION
}
public class CreatingClassesAndObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Wheels: ");
		int a = sc.nextInt();
		System.out.print("Enter No. of HeadLights: ");
		int b = sc.nextInt();
		
		Vehicle BMW = new Vehicle(a,b,""); ///OBJECT
		BMW.color = "BLACK";
		BMW.info();
		
	}

}
