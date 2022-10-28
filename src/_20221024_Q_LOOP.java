//what did happen to my code? :'( 

import javax.swing.JFrame;
import javax.swing.JOptionPane;

    public class _20221024_Q_LOOP {
    
    public static void main(String[] args){
    	
        String userName;

        String Greeting = "Good Morning! ";
        userName = getString("what is your name?");
        System.out.println(Greeting + userName);
   	}
    
    
    public static String getString(String text){
    	//Let's imitate the problem we had before!!
        return JOptionPane.showInputDialog(null, text);
        //Why we can't exit from this loop?
        //return JOptionPane.showInputDialog(null, text);

    }
    
}