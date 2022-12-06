public class _20221206_sameLetters {
    	
    public static void main(String[] args){
    	
    	//length() is to count the number of characters in a string array
    	//length is to count the number of values in an arrray
    	String[] StringArray = {"Maryam", "Albert","Alberta","Haejin","Karl"};
    	
    	//1. first letter = last letter
    	
    	
    	int wordCounter = 0;
    	
    	for(int i = 0; i< StringArray.length; i++) {
//        	char firstLetter = StringArray[i].charAt(0);
//        	char lastLetter = StringArray[i].charAt(StringArray[i].length()-1);
        
        	char firstLetter = StringArray[i].toLowerCase().charAt(0);
        	char lastLetter = StringArray[i].toLowerCase().charAt(StringArray[i].length()-1);
        	
        	if(firstLetter==lastLetter) {
        		wordCounter++;
        	}
    	}

    	//Why 0? because small and big letters are treated as a different entity
		System.out.println(wordCounter);
    	
}
}
    	 