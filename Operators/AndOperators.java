package operators;
import java.util.Scanner;
public class AndOperators {

	public static void main(String[] args) {
		Scanner ny = new Scanner(System.in);
		int number = ny.nextInt() ;
		
		if(number>=1 && number<=100) {
			System.out.println("NO. IS IN THE RANGE");
		}else if(!(number>=1 & number<=100)) {
			System.out.println("NO. IS NOT IN THE RANGE");
		}
		
		

	}

}
