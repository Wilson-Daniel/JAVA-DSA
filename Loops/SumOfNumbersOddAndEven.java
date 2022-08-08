package Loops;

import java.util.Scanner;

public class SumOfNumbersOddAndEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Times To Get Its Sum: ");
		int n =sc.nextInt();
		float result=0;
		for(float i = 1 ; i<=n ; i++) {
			if (i%2==0) {
				result-=1/i;
			}else {
				result+=1/i;
			}
		}
		System.out.print("SUM is : ");
		System.out.print(result);

	}
	

}
