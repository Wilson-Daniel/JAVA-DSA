package Loops;

import java.util.Scanner;

public class SpecialPattern3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter A Number: ");
		int n = sc.nextInt();
		int rows = n+n-1;
		
		for(int i = 1 ; i<=rows ; i++) {
			if (i<=n) {
				for (int j = 1 ; j<=i ; j++) {
					System.out.print("* ");
				}
				
			}else {
				for (int j =1 ; j<=rows-i+1 ; j++) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
			
		}
		

	}

}
