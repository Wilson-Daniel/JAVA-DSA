package Loops;

import java.util.Scanner;

public class SquarePattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Stars Required: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int j = 1 ; j<=n ; j++) {
			for (int i = 1 ; i<=n ;i++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}

	}

}
