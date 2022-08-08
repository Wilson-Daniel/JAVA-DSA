package Array;
import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
//		int a[] = {9,7,5,3,-1,-3};
//		int size = a.length;
//		for (int i = 0 ; i<size-1 ; i++) {
//			for (int j=0 ; j<size-1 ; j++) {
//				if (a[j+1] < a [j]) {
//					int temp =a[j];
//					a[j] = a[j+1] ;
//					a[j+1]=temp;
//				}
//			}
//		}
//		for(int item : a) {
//			System.out.print(item +" ");
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter No. Of Test Cases: ");
//		int n = sc.nextInt();//No. Of Test Cases
//		
//		for(int i=0 ; i<n ; i++){
//			System.out.print("Enter No. Elements: ");
//		    int a = sc.nextInt(); //no.Of Elements
//		    int array[] = new int[a];
//		    for(int j=0 ; j<a ; j++){
//		    	System.out.print("ENter: ");
//		        array[j]=sc.nextInt();
//		    }
//	    }
//		int max=array[0];
//		for(int k=0 ; k<a ; k++){
//		    if(array[k]> max){
//		        max = array[k];
//		    }
//		}
//		System.out.println(max);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//No. Of Test Cases
		
		for(int i=0 ; i<n ; i++){
		    int a = sc.nextInt(); //no.Of Elements
		    int array[] = new int[a];
		    for(int j=0 ; j<a ; j++){
		        array[j]=sc.nextInt();
		    }
    		int max=array[0];
    		for(int j=0 ; j<a ; j++){
    		    if(array[j]> max){
    		        max = array[j];
    		    }
    		    
    		}
    		System.out.println(max);
		}
	}
}
