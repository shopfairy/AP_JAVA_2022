import java.util.Arrays;

//how to keep the changes: ArrayList
public class _20221206_2Darray2 {
    	
    public static void main(String[] args){
    	
    int row = 3;
    int column = 4; 
    	
    int[][] tdArray = new int[row][column];//my initial mistake; difference between the size of array & index of array
    
    int[] arrayA = {1,2,3,4};
    int[] arrayB= {10,20,30,40};
    int[] arrayC = {100,200,300,400};
    
    for ( int i = 0 ; i < row ; i++ ) 
    {
        for ( int j = 0 ; j < column ; j++ )
       {        	
        	if(i==0) {tdArray[i][j] = arrayA[j];}
        	if(i==1) {tdArray[i][j] = arrayB[j];}
        	if(i==2) {tdArray[i][j] = arrayC[j];}
       }
    }
    
    	 System.out.println(Arrays.deepToString(tdArray));
    
    
}
}
    	 