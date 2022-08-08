package userInput;
import java.util.Scanner;

public class inputNumber {

	public static void main(String[] args) {
		Scanner nx = new Scanner(System.in);
		long A = nx.nextLong();
		long B = nx.nextLong();
		if (A>B) {
		System.out.println(A + " IS GREATER THAN " + B);
		}else if(A==B) {
			System.out.println(A +" AND "+B+ " BOTH NUMBER ARE SAME");
		}else if(A<B) {
		System.out.println(B + "  IS GREATER THAN " + A );
		}
}
}