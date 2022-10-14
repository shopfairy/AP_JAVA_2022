public class NestedLoop_3_20221013 {

	public static void main(String[] args) {
		
		//ingredients! Hip and Hurray string Array!
		String[] chantComp = {"Hip ","Hurray "};
		
		int hipTimes = 5;
		int hurrayTimes = 3;
		int LineTimes = 1;
		
		//Nice boxes to add string friends!
		String hipChant = "";	
		String hurryChant = "";	
		String singleLine = "";

		for(int i=0;i<LineTimes;i++){
			
			for(int j=0;j<hipTimes;j++){
				//each loop, nice and warm "Hip " is added!!
				hipChant = hipChant+chantComp[0];	
				}
			
			for(int k=0;k<hurrayTimes;k++){
				//each loop, nice and warm "Hip " is added!!
				hurryChant = hurryChant+chantComp[1];	
				}
			
			//Once 3 hips are ready, just add "Hurray" 
			//System.out.println(singleLine);
			singleLine = hipChant + hurryChant;
			//empty the hipChant so that it doesn't accumulate the previous values
			hipChant= "";
			hurryChant= "";
			
			System.out.println(singleLine);
			}
		}
}
