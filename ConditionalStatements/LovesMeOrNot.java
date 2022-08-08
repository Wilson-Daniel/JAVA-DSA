package ConditionalStatements;
import java.util.Scanner;

public class LovesMeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. Of Pattels: ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("HE LOVES ME!!! ");
		}else {
			System.out.println("HE LOVES ME NOT!! ");
		}
		

	}

}
