package Inheritance;

class Base{
//	public int x;
//	public void setX(int x) {
//		this.x = x;
//	}
//	public void getX() {
//		System.out.println(x);
//	}
	Base(){
		System.out.println("This Is BASE Constructor");
	}
	Base(int x){
		System.out.println("This Is OVERLOAD Base Constructor Value OF X IS:"+x);
	}	
}
class Derived extends Base{
	Derived(){
		System.out.println("This Is DERIVED Constructor");
	}
	Derived(int x,int y){
		super(x);
		System.out.println("This Is OVERLOAD Derived Constructor Value OF Y IS:"+y);
	}
}
class ChildOfDervied extends Derived{
	ChildOfDervied(){
		System.out.println("This Is ChildOfDerived Constructor");
	}
	ChildOfDervied(int x,int y, int z){
		super(x,y);
		System.out.println("This Is OVERLOAD ChildOfDervied Constructor Value OF Z IS:"+z);
	}
}

public class Constructor_In_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOfDervied c = new ChildOfDervied();
		
	}

}
