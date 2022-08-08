package userInput;
import java.util.Scanner;


public class ScannerUserinput {

	public static void main(String[] args) {
	     
		Scanner sy = new Scanner(System.in);
		int x = sy.nextInt();
		double y = sy.nextDouble();
		double c = x + y;
		float d = (float)c;
		System.out.println(c);
		System.out.println(d);
		
        
	}

}
