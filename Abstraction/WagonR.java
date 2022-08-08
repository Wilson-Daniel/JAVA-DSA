package Abstraction;

public class WagonR extends Car{
	
	public void breaking() {
		System.out.println("WagonR is Breaking ");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("WagonR is Accelerating");
	}
	
}
