//Infinite loop #1. do{}while(true)
import java.util.Scanner;

    public class Modulus_20221014 {
    	
    public static void main(String[] args){
    	
    	//the number 1 to 100 and says "New Decade" every 10 years
    	for(int i=1;i<100;i++) {
    		System.out.println(i);
    		if(i%10==0){
    			System.out.println("New Decade");
    		}
    	}
    	
    	
    	//Method1: the even number from 0 to 20
    	for(int j=0; j<20; j=j+2) {
    		System.out.println(j);
    	}
    	
    	//Method2: use continue
    	for(int k=0; k<=20; k++) {
    		if(k%2!=0) { //if k is not an even number 
    		continue; //skip one iteration! Unlike "break" which stop the iteration, "continue" only skips "1" iteration!!  
    		}
    		System.out.println(k);
    	}
    	
   	}
    	
}