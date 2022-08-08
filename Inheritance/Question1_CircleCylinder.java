package Inheritance;
import java.util.Scanner;

class Circle{
	double radius;
	double area;
	
	
	public void getRadius() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius Of CIRCLE: ");
		radius = sc.nextDouble();
	}
	public double getArea() {
		area = Math.PI*radius;
		return area;
	}
	
}

class Cylinder extends Circle{
	double height;
	double surfaceArea;
	double CSA;
	
	public void getRadius() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius Of Cylinder: ");
		radius = sc.nextDouble();
	}
	public void getHeight() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Height Of CYLINDER: ");
		height = sc.nextDouble();
	}
	
	public double getSurfaceArea() {
		surfaceArea = 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
		return surfaceArea;
	}
	public double getCurvedArea() {
		CSA = 2*Math.PI*radius*height;
		return CSA;
	}
}


public class Question1_CircleCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle c = new Circle();
//		c.getRadius();
//		System.out.println("Area Of Circle Is:"+c.getArea());
		Cylinder cc = new Cylinder();
		cc.getRadius();
		cc.getHeight();
		System.out.println("TSA Is:"+cc.getSurfaceArea());
		System.out.println("CSA Is:"+cc.getCurvedArea());
	}

}
