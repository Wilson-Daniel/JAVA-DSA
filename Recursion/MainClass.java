package Recursion;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(sum(5));
		//System.out.println(power(2,4));
		//System.out.println(fastpower(3,10));
		System.out.println(path(4,4));
	}
//	static int sum(int n) {
//		if(n == 1) {
//			return 1;
//		}
//		return n + sum(n-1);
//	}
	
	static int power(int a,int b) {
		if(b == 0){
			return 1;
		}
		return a* power(a,b-1);
	}
	static int fastpower(int a,int b) {
		if(b == 0) {
			return 1;
		}
		if(b%2 == 0){
			return fastpower(a*a,b/2);
		}
		return a*fastpower(a,b-1);
	}
	static int path(int n , int m) {
		if(n==1 || m == 1){
			return 1;
		}
		return path(n,m-1) + path(n-1,m);
	}
}
