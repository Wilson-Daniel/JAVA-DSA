package Loops;
import java.util.Scanner;

public class FabonacciNumbers {

	public static void main(String[] args) {
//		Scanner ny = new Scanner(System.in);
//		int n = ny.nextInt();
//		
//		int a = 0;
//		int b = 1;
//		
//		System.out.print(a+" ");
//		System.out.print(b+" ");
//		
//		for(int i = 0; i<n-2; i++) {
//			
//			int c=a+b;
//			System.out.print(c+" ");
//			a = b;
//			b = c;
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter A Number To Get It's Fabonnaci Series: ");
//		int n = sc.nextInt();
//		
//		
//		System.out.print("Fabonnaci Series Of "+ n + "number is: ");
//		int a = 0;
//		int b = 1;
//		
//		System.out.print(a+ " ");
//		System.out.print(b+ " "); 
//		
//		for (int i = 0 ; i<n-2 ; i++) {
//			int sum = a+b;
//			System.out.print(sum + " ");
//			a=b;
//			b=sum;
//			
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a+" ");
		System.out.println(b+" ");
		for (int i=0 ; i<n-2; i++) {
			
			int sum = a+b;
			System.out.println(sum+" ");
			a=b;
			b=sum;
		}
		
		
		
		
	}
}