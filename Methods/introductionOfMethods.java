package Methods;

public class introductionOfMethods {

	public static void main(String[] args) {
		int first = 23;
		int second =5;
		int result = maxOfNumbers(first,second);
		///int resul = methodeNAme(first,second);
		System.out.println(result);
	}
	static int maxOfNumbers(int a , int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
//	static int methodeNAme(int a , int b ) {
//		int c = a+b;
//		return c;
//	}

}
