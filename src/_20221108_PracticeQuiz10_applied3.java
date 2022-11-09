//1. Different between index and the length of an array! 
//2. why X.length-1? 
//3. What does cheeky index-- do?

import java.util.Scanner;

    public class _20221108_PracticeQuiz10_applied3 {
    	
    public static void main(String[] args){
    	
  	int[] X = {1,2,3,4,5,6,7,8};
    	
    	//what would you do? if you want to print 8,6,4,2
    	for(int index=X.length-1;index>0;index--) {
    		System.out.println("X["+index+"]="+ X[index]+"\n");	
    		index--; // instead of use two index--, you can also write index = index-2    	
    	}
    	
    	//Honestly, I would just use 
    	for(int index=X.length-1;index>0;index=index-2) {
    		System.out.println("No index-- in for loop, X["+index+"]="+ X[index]+"\n");	
    	}
    }	
}