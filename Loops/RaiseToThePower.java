package Loops;
import java.util.Scanner;

public class RaiseToThePower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter A Number: ");
//		int a = sc.nextInt();
//		System.out.print("Enter Raise To the Power: ");
//		int B = sc.nextInt();
//		int result=1;
//		for(int i = 0 ; i<B ;i=i+1) {
//			result *=a;
//		}
//		System.out.println("Output is: "+result);
		System.out.print("Enter A Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Raise To the Power: ");
		int b = sc.nextInt();
		
		int c = 1;
		
		for (int i = 0 ; i<b ; i++) {
			c *= a;
		}
		System.out.println(a + " Raise To The Power "+b+" is "+ c);
	}

}
