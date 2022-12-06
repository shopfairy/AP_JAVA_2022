import java.util.Arrays;

import com.sun.net.httpserver.Authenticator.Result;

//how to keep the changes: ArrayList
public class _20221206_2Darray3 {
    	
    public static void main(String[] args){
   
        int[] arrayA = {1,2,3,4};
	    int[] arrayB= {10,20,30,40};
	    int[] arrayC = {100,200,300,400};
	    
    	int[][]tdArray = intoOne2DArray(arrayA, arrayB, arrayC);
		System.out.println(Arrays.deepToString(tdArray));
    
}
	static int[][] intoOne2DArray(int[] arrayA, int[] arrayB, int[] arrayC){
		
		int row = 3; //the number of parameters
		int column = arrayA.length;
		
		int[][] tdArray = new int[row][column];
				
//		for ( int i = 0 ; i < row ; i++ ) 
//		    {
//		        for ( int j = 0 ; j < column ; j++ )
//		       {        	
//		        	if(i==0) {tdArray[i][j] = arrayA[j];}
//		        	if(i==1) {tdArray[i][j] = arrayB[j];}
//		        	if(i==2) {tdArray[i][j] = arrayC[j];}
//		       }
//		    }
		
	        for ( int i = 0 ; i < column ; i++ )
	       {        	
	        	if(i==0) {tdArray[i] = arrayA;}
	        	if(i==1) {tdArray[i] = arrayB;}
	        	if(i==2) {tdArray[i] = arrayC;}
	       }
		return tdArray;		
	}
}
    	 