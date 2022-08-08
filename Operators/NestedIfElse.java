package operators;
import java.util.Scanner;

public class NestedIfElse { 

	public static void main(String[] args) {
		Scanner ny = new Scanner(System.in);
		
		
		System.out.print("ENTER 1st NUMBER: ");
		int A = ny.nextInt();
		System.out.print("ENTER 2st NUMBER: ");
		int B = ny.nextInt();
		System.out.print("ENTER 3st NUMBER: ");
		int C = ny.nextInt();
		
		
		if (A>B) {
			if (A>C) {
				System.out.println(A+" IS GREATER OF ALL NUMBERS");
			}else {
				System.out.println(C+" IS GREATER OF ALL NUMBERS");
			}
		}else if(B>A) {
			if (B>C) {
				System.out.println(B+" IS GREATER OF ALL NUMBERS");
			}else {
				System.out.println(C + " IS GREATER OF ALL NUMBERS");
			}
		}else if(C>A) {
			if (C>B) {
				System.out.println(C+" IS GREATER OF ALL NUMBERS");
			}else {
				System.out.println(B+" IS GREATER OF ALL NUMBERS");
			}
		}else{
			System.out.println("NUMBERS ARE EQUAL");
		}

	}

}
