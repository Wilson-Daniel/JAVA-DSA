package GettersAndSetters;

class circle{
	private int i;
	private double area;
	public void setArea(int i) {
		if(i== 0) {
			System.out.println("Area IS Zero");
		}
		area=3.14*i*i;
	}
	public double getArea() {
		return area;
	}
}


class employee{
	private int id;
	private String name;
	
	public void setName(String n) {
		name = n;
	}
	public String getNAme() {
		return name;
	}
	public void setId(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
}


public class GetteersAndSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		circle cc = new circle();
//		cc.setArea(0);
//		System.out.println(cc.getArea());
		
		employee m = new employee();
		m.setId(64);
		System.out.println(m.getId());
		m.setName("Wilson");
		System.out.println(m.getNAme());
		
	}

}
