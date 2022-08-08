package Array;
import java.util.Scanner;
public class MultidimensionArray {

	public static void main(String[] args) {
		 
//		int age[][] = new int[3][5];
//		age[1][4]=3;
//		System.out.println(age[1][4]) ;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER DIMENSIONS ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
				
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		
		System.out.println("ENTER ARRAY A ");
		for (int i = 0 ; i<rows ; i++) {
			for (int j = 0 ; j<cols ; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("ENTER ARRAY B ");
		for(int i = 0; i <=rows ; i++) {
			for(int j = 0; j <=cols ;j++ ) {
				b[i][j]=sc.nextInt();
				
			}
		}
		int c[][] = new int [rows][cols];
		
		for  (int i = 0; i<rows ; i++) {
			for(int j =0 ; j<cols ;j++) {
				c[i][j]=a[i][j] + b[i][j];
			}
		}
		System.out.println("ADDITION OF ARRAYS IS: ");
		for (int i = 0 ; i<rows ;i++) {
			for (int j = 0 ; j<cols ; j++) {
				System.out.println(c[i][j]  + " ");
			}
			System.out.println();
		}

	}

}
