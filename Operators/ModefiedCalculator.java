package operators;

import java.util.Scanner;

public class ModefiedCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR RATING: ");
		int rating = sc.nextInt();
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("BAD REVIEW!!! ");
			break;
		case 3:
			System.out.println("AVERAGE REVIEW!!!! ");
			break;
		case 4:
		case 5:
			System.out.println("GOOD RATING ");
			break;
			
			
				
		
		}
		
		
		
		

	}

}
