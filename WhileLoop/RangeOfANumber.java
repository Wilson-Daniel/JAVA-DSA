package WhileLoop;

import java.util.Scanner;

public class RangeOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER A NUMBER: ");
		int a = sc.nextInt();
		if(a<=10) {
			System.out.println("Number Is Between 0 & 10 !!");
		}else if(a>10 && a<=20) {
			System.out.println("Number IS Between 10 & 20 !!");
		}else if (a>20 && a<=30) {
			System.out.println("Number IS Between 20 & 30 !!");
		}else {
			System.out.println("Numbeer IS Greater Then 30 !!");
		}
		

	}

}
