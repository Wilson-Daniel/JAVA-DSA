package VestorAndStacks;

import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
//		Vector <Integer> v = new Vector();
//		v.add(34);
//		v.add(4);
//		System.out.println(v);
		int[] a = {2,4,5,6};
		int[] n = new int[a.length];
		int an = a.length-1;
		for(int i=0 ;i<=a.length-1 ;i++) {
			
			n[i]=a[an];
			an--;
		}
		for(int i : n) {
			System.out.println(i);
		}
		

	}

}
