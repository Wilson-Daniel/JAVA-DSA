package Loops;
import java.util.Scanner;

public class FactorialOfANo {

	public static void main(String[] args) {
//	Scanner ny = new Scanner(System.in);
//	int n = ny.nextInt();
//	int result = 1;
//	
//	for(int i = 1 ; i<=n ; i=i+1) {
//		result = result*i;
//		
////		System.out.println(i);
//	}
//	System.out.println("Factorial of "+n+" is " +result);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter A Number To Get It's Factorial: ");
	
	int a = sc.nextInt();
	long factorial = 1;
	 for (int i = a ; i>=1 ; i--) {
		 factorial*=i;
	 }
	 System.out.println("Factorial Of "+a+" is "+factorial);
	
	}

}
