package operators;
import java.util.Scanner;

public class OrOperators {

	public static void main(String[] args) {
	Scanner my = new Scanner(System.in);
	
	System.out.print("ENTER YOUR GRADE : ");
	int ny = my.nextInt();
	
	if (ny==10 | ny==12) {
		System.out.println("YOU ARE ELIGIBLE FOR EXAMES");
	}else if (!(ny==10 || ny==12)) {
		System.out.println("YOU ARE NOT ELIGIBLE");
	}
	
	}

}
