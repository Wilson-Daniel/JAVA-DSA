package Array;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25, 17, 31, 13, 2};
		
//		for(int i=0 ; i<5 ; i++) {
//			int j = i-1;
//			while(j>=0 && arr[j]>arr[i]) {
//				arr[j+1] = arr[i];
//				
//			}
//		}
		for(int i=1 ; i<5 ; i++) {
			int key = arr[i];
			int index = i;
			while(index>0 && arr[index-1]>key) {
				arr[index] = arr[index-1];
				index--;
			}
			arr[index] = key;
		}
		System.out.print("{ ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.print("}");
	}

}
