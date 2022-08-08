package Array;
import java.util.Scanner;
public class GOGRotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Test:");
		int t = sc.nextInt();
		for(int i=0 ; i<t ; i++) {
			System.out.print("Enter N,D:");
			int N = sc.nextInt();
			int D = sc.nextInt();
			int Z =D;
			int[] a = new int[N];
			int[] c = new int[N];
			System.out.print("Enter Element:");
			for(int j=0 ; j<N ; j++) {
				a[j]=sc.nextInt();
			}
			for(int j=0 ; j<N-D ; j++) {
				c[j] = a[Z];
				Z++;
			}
			int y =N-D;
			for(int j=0 ; j<D ; j++) {
				c[y] = a[j];
				y++;
			}
			for(int x : c) {
				System.out.print(x+ " ");
			}
		}

	}

}
