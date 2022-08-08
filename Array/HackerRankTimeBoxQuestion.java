package Array;

public class HackerRankTimeBoxQuestion {

	public static void main(String[] args) {
		int a[][] = {{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},{0,0,8,6,6,0},{0,0,0,-2,0,0},{0,0,1,2,4,0}};
		int b[][] = new int[4][4];
		int c[] = new int[16];
		int f = 0;
		
		String name = new String ();
		
		for(int i=0 ; i<=3 ; i++) {
			int sum = 0;
			//System.out.println("Value of I:"+i);
			for(int j=0 ; j<=3 ; j++) {
				//System.out.println("               Value J: "+j);
			    int middle = i+1;
			    int secondLine = i+2;
			    int check = j;
			    for(int k=j ; k<=j+2 ;k++ ) {	
			    	
//			    	name+=a[i][j]+"  "
//			    			+ "  "
//			    			+a[secondLine][k]+"  ";
			    	//System.out.println("                          Value K: "+k + "   "+a[i][k]);
			    	//System.out.println("                          Value K: &--- "+k + "   "+a[secondLine][k]);
			    	
			    	sum+=a[i][k] + a[secondLine][k];
			    	if(k==check) {
			    		int jack=k+1;
			    		sum+=a[middle][jack];

			    		//b[i][k]=sum;
			    		//System.out.println("                                     Middle Value"+a[middle][jack]);
			    		//ystem.out.println("                                          Sum"+sum);
			    	}
			    	
			    }
			    b[i][j]=sum;
			    System.out.print(sum+" ");
			    
			    sum*=0;
			}System.out.println();   
		
		}
		int value=0;                    ///2D to 1D Array
		for(int i=0 ; i<=3 ;i++) {
			for(int j=0 ;j<=3 ;j++) {
				value=b[i][j];
				c[f]=value;
				f++;
			}
			//System.out.println();
		}
		
		for(int i=0 ; i<15 ; i++) {
			int minIndex=i;
			for (int l = i ; l<15 ; l++) {
				if (c[l] > c[minIndex]) {
					int temp = c[l];
					c[l]=c[minIndex];
					c[minIndex]=temp;
				}
			}
		}
		
		System.out.print(c[0]);

	}

}
