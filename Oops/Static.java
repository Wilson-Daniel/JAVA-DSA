package Oops;
public class Static {
	class B{
	}
	static class C{
		
	}
	public static void main(String[] args) {
//		Static objA = new Static();
//		Static.B objB = objA.new B();
//		C objC = new Static.C();
		Static objA = new Static();
		Static.B objB = objA.new B();
		C objC = new Static.C();
	}

}
