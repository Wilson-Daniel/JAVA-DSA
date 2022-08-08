package operators;
import java.util.Scanner;
public class SwitchCaseStatement {

	public static void main(String[] args) {
		Scanner ny = new Scanner(System.in);
		
		System.out.print("ENTER DAY OF WEEK: ");
		int day =ny.nextInt();
		switch(day){
		case 1:
			System.out.println("IT'S MONDAY");
			break;
		case 2:
			System.out.println("IT'S TUESDAY");
			break;
		case 3:
			System.out.println("IT'S WEDNESDAY");
			break;
		case 4:
			System.out.println("IT'S THRUSDAY");
			break;	
		case 5:
			System.out.println("IT'S FRIDAY");
		}
			
		

	}

}
