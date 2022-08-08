package Loops;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		float result=1;
//		for(float i=1;i<=n;i++) {
//			result +=1/i;
//			
//		}
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number TO Get The Sum Till N Numbers: ");
		int n =sc.nextInt();
		
		double result = 1;
		for(int i = 1 ; i<=n ; i++) {
			result+=1/i;
		}
		System.out.println("Sum Of N Number Is: "+result);

	}

}
