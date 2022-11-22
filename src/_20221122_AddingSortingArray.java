//Infinite loop #1. do{}while(true)
import java.util.Scanner;

    public class _20221122_AddingSortingArray {
    	
    public static void main(String[] args){
    	
    	
    	int[] Array = {4,2,3,1,6};
    	//creating a new arraylist
    	int newArray[] = new int[Array.length+1];
    	
    	for (int i = 0; i < Array.length; i++) {
    	  newArray[i]=Array[i];
       }
    	
    	int addedValue = 5; 
    	newArray[Array.length] = addedValue;
    	
    	for (int i = 0; i < newArray.length; i++) {
      	  System.out.println(newArray[i]);
         }	
    	
    	//sorting
    	for (int i = 0; i < newArray.length; i++)   
    	{  
    	for (int j = i + 1; j < newArray.length; j++)   
    	{  
    	int tmp = 0;  
    	if (newArray[i] > newArray[j])   
    	{  
    	tmp = newArray[i];  
    	newArray[i] = newArray[j];  
    	newArray[j] = tmp;  
    	}  
    	}  
    	System.out.print(newArray[i]);  
    	}
    	
    }
}