package Loops;

import java.util.Scanner;

public class PatternLowerTriangle1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Stars required: ");
		int n = sc.nextInt();
		 
		for (int j=1 ; j<=n ; j++) {
			for (int i=1 ; i<=j ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
			 
	}

}
