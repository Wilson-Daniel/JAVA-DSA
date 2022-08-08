package DoWhile;

import java.util.Scanner;

public class EnterANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=1;
		
		do {
			
			System.out.print("Enter A Number: ");
			n = sc.nextInt();

		}while(n != 0);{
			System.out.println("Program Over!!!");
		}
			
		
	}

}
