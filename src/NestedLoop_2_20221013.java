public class NestedLoop_2_20221013 {

	public static void main(String[] args) {
		
		//ingredients! Hip and Hurray string Array!
		String[] chantComp = {"Hip ","Hurray"};
		
		//How many hips do you want to repeat?
		int hipTimes = 5;
		
		//How many singleLines do you want to repeat?
		int LineTimes = 2;
		
		//Nice boxes to add string friends!
		String hipChant = "";	
		String singleLine = "";

		for(int i=0;i<LineTimes;i++){
			
			for(int j=0;j<hipTimes;j++){
				//each loop, nice and warm "Hip " is added!!
				hipChant = hipChant+chantComp[0];	
				}
			//Once 3 hips are ready, just add "Hurray" 
			//System.out.println(singleLine);
			singleLine = hipChant + chantComp[1];
			//empty the hipChant so that it doesn't accumulate the previous values
			hipChant= "";
			System.out.println(singleLine);
			}
		}
}
