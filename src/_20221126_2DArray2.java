import java.util.Arrays;

//second method: add 3*row+1 (If you want to start from a sample code) 
public class _20221126_2DArray2 {
    	
    public static void main(String[] args){
    	
    	 int RowNum = 3;
    	 int ColNum	= 4; 
    	 
    	 int[][]bingo = new int[3][4];
    	 
    	 for(int row=0; row<3; row++) {
    		 for(int column =0; column<4;column++) {
    		 bingo[row][column] = row+column;
    		 //what is happening; 
    		 //System.out.println("row= "+row+" column= "+column+"="+(row+column));
    		//System.out.println(Arrays.deepToString(bingo));
    		 bingo[row][column] += 3*row+1;
    		 } 
    		 
    	 }
    	 System.out.println(Arrays.deepToString(bingo));
}	
    }