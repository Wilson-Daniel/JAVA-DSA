package Recursion;

import java.util.HashSet;
import java.util.Set;

public class StringPrintingPermutation {
	
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		
		permutation("abcc",0,3);

	}
	static void permutation(String s,int l,int r) {
		if(l==r){
			//System.out.println(s);
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		}
		for(int i=l ; i<=r ; i++) {
			s = interchangeChar(s,l,i);
			permutation(s,l+1,r);
			s = interchangeChar(s,l,i);
		}
	}
	static String interchangeChar(String s , int a , int b) {
		char array[] = s.toCharArray();
		char temp = array[b];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array);
	}
}
