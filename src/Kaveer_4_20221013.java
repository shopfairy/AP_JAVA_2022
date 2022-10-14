
import java.util.Scanner;

    public class Kaveer_4_20221013 {
    	
    public static void main(String[] args){
	    char op;
	    boolean opIsValid;
    	Double number1, number2, result;
    	int numLoop = 5;
    	int i = 0;
    	
		do {
        Scanner input = new Scanner(System.in);
              
            System.out.println("Choose an operator: +, -, *, or /");
            op = input.next().charAt(0);
            opIsValid = (op == '+') || (op == '-') || (op == '*') || (op == '/');
           
            while (!opIsValid) {
                System.out.println("Please choose an valid operator");
                System.out.println("Choose an operator: +, -, *, or /");
                op = input.next().charAt(0);
                opIsValid = (op == '+') || (op == '-') || (op == '*') || (op == '/');
           }
           
            System.out.println("Enter first number");
            number1 = input.nextDouble();
            
            System.out.println("Enter second number");
            number2 = input.nextDouble();
            
                switch (op) {
               
                    case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;
                   
                   
                    case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    System.out.println("\b");
                    break;
                   
                   
                    case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    System.out.println("\b");
                    break;
                   
                   
                    case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    System.out.println("\b");
                    break;
                   
                    default:
                    System.out.println("Invalid operator!");
                    System.exit(0);
                    break;
                }
                i++;
                System.out.println("#"+i+" iteration");
    		} while (i<numLoop); 
    	}
    	
}