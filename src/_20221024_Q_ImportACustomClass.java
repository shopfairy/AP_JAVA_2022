//what did happen to my code? :'( 

import javax.swing.JFrame;
import javax.swing.JOptionPane;

    public class _20221024_Q_ImportACustomClass {
    
    public static void main(String[] args){
    	
    	_20221024_Q_ImportACustomClass2 customClass = new _20221024_Q_ImportACustomClass2();
    	
        String userName;
        String Greeting = "Good Morning! ";
        userName = customClass.getString("what is your name?");
        System.out.println(Greeting + userName);
   	}   
}