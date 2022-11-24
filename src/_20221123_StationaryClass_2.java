//Infinite loop #1. do{}while(true)
import java.util.Scanner;

    public class _20221123_StationaryClass_2 {
    	
    public static void main(String[] args){
    	
    	
    	//construct without an arguments
    	StationaryClass bic = new StationaryClass();
      	bic.make = "BIC";
    	bic.numberOfColours = 1;
    	bic.ballPoint = true;
    	bic.size = 0.5;    	
    	System.out.println(bic.make + " has " + bic.numberOfColours + " colour");
    	bic.isBallPiint();

    	//constructor with 2 arguments
    	StationaryClass sharpie = new StationaryClass("Sharpie", 2);	
    	System.out.println(sharpie.make + " has " + sharpie.numberOfColours + " colours\n");
    	
    	//constructor with 4 arguments
    	StationaryClass paperMate = new StationaryClass("PaperMate", 6, true, 0.5);	
    	paperMate.isBallPiint();

}
    }