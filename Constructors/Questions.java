package Constructors;


class cylinder{
	private int height;
	private int radius;
	
	public void setRadius(int r) {
		radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public void setHeigth(int h) {
		height = h;
	}
	public int getHeight() {
		return height;
	}
	public double getVolume() {
		return Math.PI*radius*radius*height;
	}
	public double getSurfaceArea() {
		return 2*Math.PI*radius*radius + 2*Math.PI*radius*radius;
	}
	
}

public class Questions {

	public static void main(String[] args) {
		cylinder cc = new cylinder();
		cc.setHeigth(4);
		cc.setRadius(4);
		System.out.println(cc.getSurfaceArea());
		System.out.println(cc.getVolume());
	}

}
