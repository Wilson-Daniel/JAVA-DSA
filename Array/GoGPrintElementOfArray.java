package Array;
import java.util.Scanner;

public class GoGPrintElementOfArray {
	static void printArr() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No.: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0 ; i<n ;i++) {
			System.out.print("Enter Element: ");
			arr[i]=sc.nextInt();
		}
		for (int item:arr) {
			System.out.print(item+" ");
		}
	}

	public static void main(String[] args) {
		printArr();

	}

}
