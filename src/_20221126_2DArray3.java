import java.util.Arrays;

//second method: add 3*row+1 (If you want to start from a sample code) 
public class _20221126_2DArray3 {
    	
    public static void main(String[] args){
    	
    	 String[][] names = {{"Bob","Sally","Bill"},{"Betty","Betty","Trish"}};
    	 
    	//if you want to print your array as a matrix   
         for (String[] row : names)
         {
         	for(String column : row) {
         		System.out.print(column+" "); 
         	}
         	System.out.println();
         }  
    	 
}	
    }