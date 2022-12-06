public class Switch {
	
	public char word;

	public void SwitchLetters (char a, char b) {
		char temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Inside SwitchLetters(): a = "+a+", b = "+b);
	}
	
	public char[] SwitchLetters2 (char a, char b) {
			
		char[] values = new char[2];
		values[0] = b;
		values[1] = a;
		System.out.println("Inside SwitchLetters(): a = "+values[0]+", b = "+values[1]);
		return values;
	}
	
	public void SwitchLetters3 (Switch a, Switch b) {
		char temp;
		temp = a.word;
		a.word = b.word;
		b.word = temp;
		System.out.println("Inside SwitchLetters(): a = "+a+", b = "+b);
	}
	
	
	
}
