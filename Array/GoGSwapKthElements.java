package Array;

public class GoGSwapKthElements {
	static void SwapKth(int a , int b) {
		int arr[]= {1,3,4,8,5,6,7};
		int temp = arr[b-1];
		arr[b-1]=arr[a-b];
		arr[a-b]= temp;
		for(int item : arr) {
			System.out.print(item);
		}
		return;
	}

	public static void main(String[] args) {
		SwapKth(7,2);

	}

}
