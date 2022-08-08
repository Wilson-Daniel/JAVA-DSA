package Loops;
import java.util.Scanner;
public class Lecture4HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;
		do{
			System.out.print("ENTER MARKS: ");
			int marks = sc.nextInt();
			if(marks >= 90 && marks<=100) {
				System.out.println("This Is Good");
			}else if(marks >= 60 && marks<=89){
				System.out.println("This is also Good");
			}else{
				System.out.println("This is Good as well");
			}
			System.out.print("Enter 1 or 0: ");
			n = sc.nextInt();
		}while(n ==1 );
//		while(n != 0 ) {
//			
//		}

	}

}
