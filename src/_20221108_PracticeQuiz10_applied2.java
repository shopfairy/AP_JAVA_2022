//1. Different between index and the length of an array! 
//2. why X.length-1? 
//3. What does cheeky index-- do?

import java.util.Scanner;

    public class _20221108_PracticeQuiz10_applied2 {
    	
    public static void main(String[] args){
    	
  	int[] X = {1,2,3,4,5,6,7,8};
    	
    	//what would you do? if you want to print 7,3
    	for(int index=X.length-1;index>0;index--) {
    		index--;
    		System.out.println("X["+index+"]="+ X[index]+"\n");	
    		index--; //
    		index--; // instead of use two index--, you can also write index = index-2 

    	}
    }	
}