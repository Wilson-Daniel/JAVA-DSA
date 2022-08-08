package WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int temp = n ;
//		int sum = 0;
//		
//		while(temp>0) {
//			int lastdigit =temp %10;
//			temp/=10;
//			sum += lastdigit;
//		}
//		System.out.println("Sum Of Given Number Is : "+sum);
		System.out.print("Enter A Number To Gets It's Sum: ");
		int n = sc.nextInt();
		int temp = n;
		int sum =0;
		
		System.out.println(n);
		
		while (temp>0) {
			int lastDigit = temp%10;
			temp/=10;
			sum+=lastDigit;
			
			System.out.println(lastDigit +" "+ temp +" "+ sum);
		}
		System.out.println("Sum of "+n+" is "+sum);
	
		
		

	}

}
