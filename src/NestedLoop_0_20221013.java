public class NestedLoop_0_20221013 {

	public static void main(String[] args) {
		
		//How many hips do you want to repeat?
		int hipTimes = 3;		
		//How many singleLines do you want to repeat?
		int lineTimes = 3;
		
		//Nice boxes to add string friends!
		String hipChant = "";	
		String singleLine = "";

		for(int i=0;i<lineTimes;i++){
			for(int j=0;j<hipTimes;j++){
				//each loop, nice and warm "Hip " is added!!
				hipChant = hipChant+"Hip ";	
			}
			//Once 3 hips are ready, just add "Hurray" 
			singleLine = hipChant + "Hurray ";
			hipChant = "";
			System.out.println(singleLine);
		}		
		
	}
}
