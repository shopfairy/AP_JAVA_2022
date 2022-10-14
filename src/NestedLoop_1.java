public class NestedLoop_1 {

	public static void main(String[] args) {
		
		//ingredients! Hip and Hurray string Array!
		String[] chantComp = {"Hip ","Hurray"};
		
		//How many hips do you want to repeat?
		int hipTimes = 3;
		
		//How many singleLines do you want to repeat?
		int LineTimes = 4;
		
		//Nice boxes to add string friends!
		String hipChant = "";	
		String singleLine = "";
		String chant = "";

		for(int j=0;j<hipTimes;j++){
			//each loop, nice and warm "Hip " is added!!
			hipChant = hipChant+chantComp[0];	
		}
		//Once 3 hips are ready, just add "Hurray" 
		singleLine = hipChant + chantComp[1];
		System.out.println(singleLine);
	}
}
