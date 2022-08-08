package operators;

import java.util.Scanner;

public class TurnnaryOperator {

	public static void main(String[] args) {
		Scanner ny = new Scanner(System.in);
		int A = ny.nextInt();
		int B = ny.nextInt();
		int C = ny.nextInt();
		int result=0;
		result = A>B ? A>C ? A : C :  B>C ? B : C;
		System.out.println("GREATEST OF ALL NUMBER IS "+result);
	}

	

}
