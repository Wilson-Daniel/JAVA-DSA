package WhileLoop;

import java.util.Scanner;

public class FindingNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = sc.nextInt();
		
		int numberOfDigits = (int)Math.log10(n)+1;
		System.out.println("Number Of Digits Are: "+numberOfDigits);

	}

}
