package Loops;

import java.util.Scanner;

public class NegativeNumberImput {

	public static void main(String[] args) {
		Scanner ny = new Scanner(System.in);
		for(;;) {
			System.out.print("Enter A Number: ");
			int n = ny.nextInt();
			if(n>35) {
				System.out.println(" !!!!!Positive NUmber Entered!!!");
				
			}else {
				System.out.println(" !!!!!Negative Number Entered!!!");
				System.out.print(" !!!Error!!!");
				break;
			}
		}
		

	}

}
