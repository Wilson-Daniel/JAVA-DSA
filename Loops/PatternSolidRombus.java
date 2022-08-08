package Loops;

public class PatternSolidRombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=n ; i>=1 ; i--) {
			for(int j=i-1 ; j>=1 ; j--) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=n ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
