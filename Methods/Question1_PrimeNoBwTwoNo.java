package Methods;
import java.util.*;
public class Question1_PrimeNoBwTwoNo {
	public static void primno(int n,int m) {
		boolean flag=true;
		
		for(int j=n ; j>=m ; j++) {
			int mid = j/2;
			if(j==0 || j==1) {		
				System.out.println("No Prime NO.");
			}else {
				for(int i=2 ; i<=mid ; i++) {
					if(j%i == 0) {
						flag=false;
						break;
					}
				}
				
			}
			if(flag == true) {
				System.out.println(j);
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		primno(n,m);

	}

}
