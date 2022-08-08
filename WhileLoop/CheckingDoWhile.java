package WhileLoop;
import java.util.Scanner;
public class CheckingDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = "TRUE";
		do {
			System.out.print("Want To Enter: ");
			String sts = sc.nextLine();
		}while (N != "FALSE");
		
	}

}
