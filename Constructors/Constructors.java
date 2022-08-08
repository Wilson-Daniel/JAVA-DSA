package Constructors;

class myemployee{
	
	private int id;
	private String name;
	public myemployee(String n , int i) {
		id = i;
		name=n;
	}
	public myemployee() {
		id = 45;
		name="Your-NAme-Here";
	}
	public myemployee(String n) {
		id = 45;
		name=n;
	}
	
	
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



public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myemployee emp = new myemployee("MAX");
//		emp.setName("Hello");
		System.out.println(emp.getId());
		System.out.println(emp.getNAme());
	}

}
