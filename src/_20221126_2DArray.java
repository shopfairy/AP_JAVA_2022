//Printing 1-12: method#1: using a counter 

public class _20221126_2DArray {
    	
    public static void main(String[] args){
    	
    	 
    	int rowMax= 3;
    	int colMax = 4;
    	
    	int[][] arr = new int[rowMax][colMax];
    	
    	//first method: using a counter
    	int counter = 1;
    	 
        for (int i = 0; i < rowMax; i++) {
        	for (int j = 0; j < colMax; j++) {
        		arr[i][j] = counter;
        		counter++;
       		//    System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
        	}
        }
//if you want to print your array as a matrix   
        for (int[] row : arr)
        {
        	for(int column : row) {
        		System.out.print(column+" "); 
        	}
        	System.out.println();
        }            
}
    }