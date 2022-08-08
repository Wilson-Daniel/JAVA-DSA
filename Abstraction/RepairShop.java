package Abstraction;

public class RepairShop {
	public static void repairCar(Car car) {
		System.out.println(car+"Car is repared");
	}
	
	public static void main(String[] args) {
		WagonR wagon = new WagonR();
		Audi audi = new Audi();
		repairCar(wagon);
		repairCar(audi);
	    audi.accelerate();
	}

}
