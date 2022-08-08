package operators;

import java.util.Scanner;

public class ModefiedNestedIfElse {

	public static void main(String[] args) {
		Scanner ny = new Scanner(System.in);
		
		
		System.out.print("ENTER 1st NUMBER: ");
		int A = ny.nextInt();
		System.out.print("ENTER 2st NUMBER: ");
		int B = ny.nextInt();
		System.out.print("ENTER 3st NUMBER: ");
		int C = ny.nextInt();
		
		
		int result=0;
		
		if (A>B){
			if (A>C) {
				result = A;
			}else {
				result = C;
			}
			
		}else {
			if (B>C) {
				result = B;
			}else {
				result = C;
			}
		}
		System.out.println(result + " IS GREATEST OF ALL NUMBERS");
	}
}
