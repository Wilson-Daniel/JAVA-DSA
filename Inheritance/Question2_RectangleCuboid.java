package Inheritance;

class Cuboid{
	int s;
	private int area;
	private int volume;
	Cuboid(int s){
		this.s = s;
	}
	public void setarea() {
		this.area = s*s;
	}
	public double getarea(){
		return area;
	}
	
	public void setvolume() {
		this.volume = area*s;
	}
	public double getvolume() {
		return volume;
	}
}

class Rectangle extends Cuboid{
	int b;
	int h;
	private int Rarea;
	private int Rvolume;
	Rectangle(int l,int b,int h){
		super(l);
		this.b = b;
		this.h = h;
	}
	public void setRarea() {
		this.Rarea = s*b;
	}
	public double getRarea() {
		return Rarea;
	}
	
	public void setRvolume() {
		this.Rvolume = Rarea*h;
	}
	public double getRvolume() {
		return Rvolume;
	}
}

public class Question2_RectangleCuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid c = new Cuboid(4);
		c.setarea();
		System.out.println(c.getarea());
		c.setvolume();
		System.out.println(c.getvolume());
		
		Rectangle r = new Rectangle(3,4,5);
		r.setRarea();
		System.out.println(r.getRarea());
		r.setRvolume();
		System.out.println(r.getRvolume());
	}

}
