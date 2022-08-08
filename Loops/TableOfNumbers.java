package Loops;
import java.util.Scanner;

public class TableOfNumbers {

	public static void main(String[] args) {
//		Scanner ny = new Scanner(System.in);
//		System.out.println("Enter A No. To Know It's Table: ");
//		int n= ny.nextInt();
//		int sum=0;
//		System.out.println("Table Of "+n +" is");
//		for(int i = 0;i <=10;i=i+1) {
//			sum = i*n;
//			
//			System.out.println(n + "*" + i +"=" + sum );
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER TO GET A TABLE: ");
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i=1 ; i<=10 ; i++) {
			sum = a*i;
			System.out.println(a + " * " + i + " = " + sum);
		}
	}

}
