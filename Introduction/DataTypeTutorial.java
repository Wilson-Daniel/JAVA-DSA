package introduction;

import java.util.Scanner;
	

public class DataTypeTutorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter PRINCIPLE: ");
		int principle = sc.nextInt();
		System.out.print("Enter RATE: ");
		float intrest = (float)sc.nextFloat();
		System.out.print("Enter Year: ");
		int year =sc.nextInt();
		float simpleIntrest = (float)principle*intrest*year/100;
		System.out.println("The Simple Intres is: "+simpleIntrest);
		
		
		
		
	}

}
