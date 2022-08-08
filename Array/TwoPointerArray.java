package Array;

import java.util.Arrays;


public class TwoPointerArray {
	public boolean twoSum(int a[] , int x , int i) {
		int j= a.length -1;
		while(i<j) {
			if(a[i] + a[j] > x) {
				j--;
			}else if (a[i]+a[j] < x) {
				i++;
			}else {
				return  true;
			}
		}
		return false;
	}


}
