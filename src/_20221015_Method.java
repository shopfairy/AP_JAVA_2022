//Infinite loop #1. do{}while(true)
import java.util.Scanner;

    public class _20221015_Method {
    	
    public static void main(String[] args){
    	
//    	int a = 5;
//    	int b = 10;
//    	System.out.println(a*b);
//    	
//    	int c = 2;
//    	int d = 3;
//    	System.out.println(c*d);
//    	
//      int e = 4;
//    	int f = 5;
//    	System.out.println(e*f);
    	
    	//9 lines can be reduced to 3 lines!!!
    	multiply(5, 10);
    	multiply(2, 3);
    	multiply(4, 5);
   	}
    
    public static void multiply(int x,int y) {
    	System.out.println(x*y);
    };
    
    public static void divide(int x,int y) {
    	System.out.println(x/y);
    };
    
    public static void add(int x,int y) {
    	System.out.println(x+y);
    };
    
    public static void subtract(int x,int y) {
    	System.out.println(x-y);
    };
    	
}