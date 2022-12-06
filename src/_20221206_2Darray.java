import java.util.Arrays;

public class _20221206_2Darray {
    	
    public static void main(String[] args){
    	
    int row = 3;
    int column = 4; 
    	
    int[][] tdArray = new int[row][column];
    
    int[] arrayA = {1,2,3,4};
    int[] arrayB= {10,20,30,40};
    int[] arrayC = {100,200,300,400};
    
        for ( int j = 0 ; j < column ; j++ )
       {        	
        	if(j==0) {tdArray[j] = arrayA;}
        	if(j==1) {tdArray[j] = arrayB;}
        	if(j==2) {tdArray[j] = arrayC;}
       }
    
    	 System.out.println(Arrays.deepToString(tdArray));
    
    
}
}
    	 