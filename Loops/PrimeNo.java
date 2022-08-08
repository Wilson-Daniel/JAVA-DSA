package Loops;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		boolean isPrime = true ;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//			isPrime = false;
//			break;
//			}
//			
//		}
//		System.out.println("Is Prime = "+ isPrime);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		 
		
		for (int i = 2 ; i*i<=n ; i++) {
			if (n%i==0) {
				System.out.println("It's Not A Prime Number ");
				break;
			}else {
				System.out.println("It's A Prime Number ");
				break;
			}
		}
		
	}
}
