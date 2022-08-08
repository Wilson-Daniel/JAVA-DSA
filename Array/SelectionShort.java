package Array;

public class SelectionShort {

	public static void main(String[] args) {
//		int a[] = {3,1,-2,7,4,0};
//		int n = a.length;
//		for(int i = 0 ; i<n-1 ; i++) {
//			int minInd = i ;
//			for(int j = i ; j<n ; j++) {
//				if (a[j]<a[minInd]) {
//					minInd = j;
//					
//				}
//			}
//			int temp = a[i];
//			a[i] = a[minInd];
//			a[minInd] = temp;
//			
//		}
//		for(int e : a) {
//			System.out.print(e + " " );
			int a [] = {7,9,0,-4,18,-3};
			int n = a.length;
//			int temp=0;
//			
//			for(int i=0 ; i<n ; i++) {
//				int minindx = i;
//				for(int j=i ; j<n ; j++) {
//					if(a[j] < a[minindx]) {
//						temp = a[j];
//						a[j] = a[minindx];
//						a[minindx] = temp;
//					}
//					
//				}
//				
//			}
//			for(int c: a) {
//				System.out.print(c+ " ");
//			}
			for(int i = 0 ; i<n-1 ; i++) {
				int minIndex = i;
				for(int j=i ; j<n ; j++) {
					if(a[j]<a[minIndex]) {
						minIndex = j ; 
					}
				}
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
			for(int c: a) {
				System.out.print(c+ " ");
			}
		 
		

	}

}
