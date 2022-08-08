package Array;

import java.util.Scanner;

public class MultiplicationOfArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. Of Rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter No. Of Columns: ");
		int clos = sc.nextInt();
		
		int A[][] = new int[rows][clos];
		int B[][] = new int[rows][clos];
		
		System.out.println("ARRAY A");
		for (int i = 0 ; i<rows ; i++) {
			for (int j = 0 ; j<clos ; j++) {
				System.out.print("Enter Element :");
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("ARRAY B");
		for (int i = 0 ; i<rows ; i++) {
			for (int j = 0 ; j<clos ; j++) {
				System.out.print("Enter Element :");
				B[i][j]=sc.nextInt();
			}
		}
		int C[][] = new int[rows][clos];
		for (int i = 0 ; i<rows ; i++) {
			for (int j = 0 ; j<clos ; j++) {
				System.out.println(A[i][j]) ;
				System.out.println(B[i][j]);
				
				System.out.println(B[(i+1)][j]);
				///C[i][j]=( (A[i][j] * B[i][j]) + (A[i][j]*B[(i+1)][j]) );
			}
			System.out.println();
		}
//		System.out.println("MULTIPLICATION OF ARRAY A AND B");
//		for (int i = 0 ; i<rows ; i++) {
//			for (int j = 0; j<clos ; j++) {
//					System.out.println(C[i][j]+ "");
//			}
//			System.out.println();
//		}

	}

}
