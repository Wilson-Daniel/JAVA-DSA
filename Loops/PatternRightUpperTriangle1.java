package Loops;

import java.util.Scanner;

public class PatternRightUpperTriangle1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number Of Stars Required: ");
		int n = sc.nextInt();
		System.out.println();
		for(int i=n ; i>=1 ; i--) {
			
			for (int j=i ; j>=1 ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
