package Loops;

public class PatternFloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int m = 6;
		int x = 1;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i; j++ ) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}

}
