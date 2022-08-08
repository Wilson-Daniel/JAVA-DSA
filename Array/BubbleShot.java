package Array;

public class BubbleShot {

	public static void main(String[] args) {
		
//		int a[] = {2,1,8,-3,6,4,12};
//		int n = a.length;
//		 for (int i = 0 ; i<n-1 ; i++) {
//			 
//			 boolean sorted = true;
//			 
//			 for (int j = 0 ; j<n-1-i ; j++) {
//				 
//				 if (a[j+1] < a[j]) {
//					 int temp = a[j+1];
//					 a[j+1] = a[j];
//					 a[j] = temp;
//					 
//					 sorted = false;
//				 }
//			 }
//			 
//			 if (sorted) break;
//			 
//		 }
//		 for (int item : a) {
//			 System.out.print(item + " " );
//		 }
		int a [] = {9,8,7,6,-5,-4,-2,-1,-45};
		int n = a.length;
		boolean sorting = true;
		
		for (int i =0 ;  i <n-1 ; i++) {
			for (int j=0 ; j<n-1-i ; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorting = false ;
				}
			}
			if(sorting) break;	
		}
		System.out.println("SHORTED ARRAY");
		for (int item : a) {
			System.out.print(item +" ");
		}
	}

}
