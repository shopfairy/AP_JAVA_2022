//Infinite loop #1. do{}while(true)
import java.util.Scanner;

    public class _20221115_ArraySort {
    	
    public static void main(String[] args){

    	int[] listOfNumbers = {9,7,3,1,5};
        
        PrintArray(listOfNumbers);
        
        int largest, temp;

  
        for(int index2=0;index2<listOfNumbers.length;index2++)
        {
            for (int index = 0; index<listOfNumbers.length-index2-1;index++)
            {   
            largest = listOfNumbers[listOfNumbers.length-index2-1];
                if(largest<listOfNumbers[index])
                {
                    temp=listOfNumbers[listOfNumbers.length-1-index2];
             	    listOfNumbers[listOfNumbers.length-1-index2] = listOfNumbers[index];   
			// Note: The line above needs to be spaced correctly              
                    listOfNumbers[index]=temp;
                }
            } 
        PrintArray(listOfNumbers);  
        }
    }
    


    public static void PrintArray(int[ ] list)
    {
    System.out.println("The numbers are:");
        for(int index = 0; index<list.length;index++)
        {
        System.out.println(list[index]);    
        }
    }

}