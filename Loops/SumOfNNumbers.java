package Loops;
import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int sum = 0;
		int n =ns.nextInt();
		for(int i=1;i<=n;i=i+1) {
			sum=sum+i;
		
		}System.out.println("Sum OF "+n + " is: "+sum);

	}

}
