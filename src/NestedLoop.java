public class NestedLoop {

	public static void main(String[] args) {
		
		
		//outerLoop
		for(int HurrayTimes=1; HurrayTimes<4; HurrayTimes++) { 
			
		String chant = "";
		//nested loop, innerLoop
			for(int HipTimes=1; HipTimes<4; HipTimes++) {
				chant = "hip ";
				System.out.print(chant);
			}
		//why int HipTimes=1; HipTimes<4? (repeat 3 times) 
		//System.out.println("\nWhat is the value of chant after the inner loop? "+chant);
		chant = chant + "hurray";
		
		System.out.println(chant);
		}
	}
}
