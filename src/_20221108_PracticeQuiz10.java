//1. Different between index and the length of an array! 
//2. why X.length-1? 
//3. What does cheeky index-- do?

import java.util.Scanner;

    public class _20221108_PracticeQuiz10 {
    	
    public static void main(String[] args){
    	  		
        	//X.length (length of array is 8)
        	//why -1? as the maximum index number is 7
        	//(e.g. X[0]=1, X[1]=2, X[2]=3, X[3]=4, X[4]=5, X[5]=6, X[6]=7, X[7]=8)
        	int[] X = {1,2,3,4,5,6,7,8};
        	

        	//Can you decode what this loop means?
        	//starting from _____, it continues till index>0, every loop, index # decreases by ____.
        	//ANS: starting from index= 7, it continues till index>0, every loop, index # decreases by 1.
        	for(int index=X.length-1;index>0;index--) {
        		//index-- is a simple for of "index = index-1"
        		//let's say, for the first loop, up to this point, index is 7
        		System.out.println("index before index--: "+index);
        		index--;
        		//Once, it passes index--, index is now 6 
        		System.out.println("index after index--: "+index);
        		//X[6] = 7 !! voila!! 
        		System.out.println("X["+index+"]="+ X[index]+"\n");	
    	}
    }	
}