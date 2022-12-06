public class _20221206_sameLetters2 {
    	
    public static void main(String[] args){
    	
    	String[] StringArray = {"Maryam", "Albert","Alberta","Haejin","Karl"};
    	int wordCounter = sameLetters(StringArray);
    	    	
    }
    
    public static int sameLetters(String[] StringArray) {
    	
    	int wordCounter = 0;
    	
    	for(int i = 0; i< StringArray.length; i++) {
        
        	char firstLetter = StringArray[i].toLowerCase().charAt(0);
        	char lastLetter = StringArray[i].toLowerCase().charAt(StringArray[i].length()-1);
        	
        	if(firstLetter==lastLetter) {
        		wordCounter++;
        	}
    	}

    	//Why 0? because small and big letters are treated as a different entity
		System.out.println(wordCounter);
		return wordCounter;
    	
    } 
    
}
    	 