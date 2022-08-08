package ExceptionHandling;

public class TryAndCatch {

	public static void main(String[] args) {
		///TRY -CATCH METHODE
		
//		try {
////			int arr[] = new int[5];
////			System.out.println(arr[6]);
//			int a = 5;
//			int b = 0 ;
//			int c = a/b;
//			
//			System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage() + " occured , pleasse check your Code ");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index should be int he range of 0 to size of array ");
//		}//catch(Exception e ) {
////			System.out.println("Errors "+e);
////		}
//		catch(IllegalArgumentException e ) {
//			System.out.println("check your casting carefully");
//		}finally {
//			System.out.println("SORRY For The Inconvinience");
//		}
		fun1();
		
	}
	static void fun1() {
		int a =5;
		int b =6 ;
		int c =a/b;
		System.out.println(c);
		try {
			fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage()+"  is an error.");
		}
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if (isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger is Coming. ");
		}
	}

}
