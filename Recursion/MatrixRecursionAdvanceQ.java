package Recursion;

public class MatrixRecursionAdvanceQ {

	public static void main(String[] args) {
		
		int a[][] = {{1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,0,0},
				{1,0,0,1,1,0,1,1},
				{1,2,2,2,2,0,1,0},
				{1,1,1,2,2,0,1,0},
				{1,1,1,2,2,2,2,0},
				{1,1,1,1,1,2,2,1},
		};
		floodfill(a,0,0,0,1);
		printmatrix(a);
	}
	static void floodfill(int a[][], int r, int c, int toFill, int prevFill) {
		int rows = a.length;
		int cols = a[0].length;
		if(r<0 || r>=rows || c<0 || c>=cols){
			return;
		}
		if(a[r][c] != prevFill){
			return;
		}
		a[r][c] = toFill;
		floodfill(a,r-1,c, toFill,prevFill);
		floodfill(a,r+1,c , toFill,prevFill);
		floodfill(a,r,c+1 , toFill,prevFill);
		floodfill(a,r,c-1 , toFill,prevFill);
	}
	static void printmatrix(int a[][]) {
		int rows = a.length;
		int cols = a[0].length;
		for(int i=0 ; i< rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
