
public class _20221205_switchthevariables {
    	
    public static void main(String[] args){
    	
    	char a = 'a';
    	char b = 'b';
    	
    	Switch letters = new Switch();
    	System.out.println("before SwitchLetters(): a = "+a+", b = "+b);

		letters.SwitchLetters(a, b);
		System.out.println("after exiting the SwitchLetters: a = "+a+", b = "+b);
    	
    }
}

    	 