//how to keep the changes: ArrayList
public class _20221205_switchthevariables2 {
    	
    public static void main(String[] args){
    	   	
    	char a = 'a';
    	char b = 'b';

    	
    	Switch letters = new Switch();
    	System.out.println("before SwitchLetters(): a = "+a+", b="+b);

		char[] values = new char[2];
		values = letters.SwitchLetters2(a, b);
		System.out.println("after exiting the SwitchLetters: a = "+values[0]+", b="+values[1]);
}
}
    	 