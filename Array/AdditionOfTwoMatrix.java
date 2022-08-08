package Array;

import java.util.Scanner;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Rows: ");
		int r = sc.nextInt();
		System.out.print("Enter Number Of Columns: ");
		int c = sc.nextInt();
		
		int a [][] = new int [r][c];
		int b [][] = new int [r][c];
		
		///MATRIX A
		System.out.println();
		System.out.println("Enter MATRIX A");
		System.out.println();
		
		for (int i = 0 ; i<r ;i++) {
			for (int j =0 ; j<c ; j++) {
				System.out.print("Enter "+(i+1)+"th ROW   "+(j+1)+"th COLUMN Element: ");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		///MATRIX B
		System.out.println();
		System.out.println("Enter MATRIX B");
		System.out.println();
		
		for (int i = 0 ; i<r ;i++) {
			for (int j =0 ; j<c ; j++) {
				System.out.print("Enter "+(i+1)+"th ROW   "+(j+1)+"th COLUMN Element: ");
				b[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		///ADDITION OF A & B TO NEW MATRIX 
		int d [][] = new int [r][c];
		
		for (int i = 0 ; i<r ;i++) {
			for (int j =0 ; j<c ; j++) {
				
				d[i][j] = a[i][j] + b[i][j];
			}	
		}
		
		///NEW MATRIX
		System.out.println();
		System.out.println("Addition Of MATRIX A & B is: ");
		System.out.println();
		
		for (int i = 0 ; i<r ;i++) {
			for (int j =0 ; j<c ; j++) {
				System.out.print(d[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
