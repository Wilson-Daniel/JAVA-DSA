package ConditionalStatements;
import java.util.Scanner;
public class ShortCutIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER AGE OF PERSON 1 : ");
		int age = sc.nextInt();
		System.out.print("ENTER AGE OF PERSON 2 : ");
		int age1 = sc.nextInt();
		
		int greater = 0 ;
		
		greater = (age>age1) ?  age : age1 ;
		
		System.out.println("Age of "+ greater + " is greater. "); 
		

	}

}
