package Loops;

public class pattern1_0_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=5;
		int sum = 0;
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++) {
				sum = i+j;
				if(sum%2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();			
		}
	}

}
