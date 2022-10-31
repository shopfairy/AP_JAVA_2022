//Hi Aidan! Let me share a series of codes that strengthens your programming capacity!!!
//We we go over the following topics:
//1. Loop vs No-loop
//2. .length()
//3. .charAt()
//4. **Nested Loop**

    public class _20221028_AidanQuestion_1 {
    	
    public static void main(String[] args){
    	// for(initialization; test; update)
    	int LoopTimes = 5;
     	for(int counter = 0; counter < LoopTimes ; counter++){
    		System.out.println(counter);
    	}
     	
     //What if we don't use the loop statement?! here is what the code would look like!
     	
     	System.out.println("--------------When we don't use loop---------------");
     	
     	int counter_NoLoop = 0;
   		System.out.println(counter_NoLoop);
   		counter_NoLoop = counter_NoLoop + 1; //now counter is 1 
     	
   		System.out.println(counter_NoLoop);
   		counter_NoLoop = counter_NoLoop + 1; //now counter is 2
   		
   		System.out.println(counter_NoLoop);
   		counter_NoLoop = counter_NoLoop + 1; //now counter is ??? <- Can you guess?
     
   		System.out.println(counter_NoLoop);
   		counter_NoLoop = counter_NoLoop + 1; //now counter is 4

  		System.out.println(counter_NoLoop);
   		counter_NoLoop = counter_NoLoop + 1; //now counter is 5
   	}
}