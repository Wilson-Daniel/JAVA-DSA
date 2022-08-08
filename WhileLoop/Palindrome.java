package WhileLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = sc.nextInt();
		
		int reverseNumber = 0;
		int temp = n;
		
		while(temp>0) {
			int lastDigit =temp%10;
			reverseNumber*=10;
			reverseNumber+=lastDigit;
			temp/=10;
		}
		System.out.println("Reversed Number: "+reverseNumber);
		if(n==reverseNumber) {
			System.out.println("Given Number Is 'Palindrome'" );
		}else {
			System.out.println("Given Number Is 'Not A Palindrome' ");
		}

	}

}
