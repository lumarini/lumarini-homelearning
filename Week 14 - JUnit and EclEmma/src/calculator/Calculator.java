package calculator;
import java.util.Scanner;

public class Calculator {
	

	public static int sum(int a, int b) {
		 int result = a + b;
		 return result;
		}
	
	
	public static int subtract(int a, int b) {
		 int result = a - b;
		 return result;
		}
	
	public static int multiply(int a, int b) {
		 int result = a * b;
		 return result;
		}
	
	public static int divide(int a, int b) {
		 int result = a / b;
		 return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Java Calculator");
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Firstly, enter a number:");
        
        int firstNum = s.nextInt();
        
        System.out.println("Thanks! Now, please enter another number here:");
        
        int secondNum = s.nextInt();
        
        System.out.println("That's Great! Lastly, please choose the operator you wish. Type 1 for sum, 2 for subtract, 3 for multiplication or 4 for division: ");
                
        int operator = s.nextInt();
        
        String operator_name;
        int result;
        
        
        if (operator == 1) {
        	operator_name = "Sum";}
        else if (operator == 2) {
            operator_name = "Subtract";
        } 
        else if (operator == 3) {
            operator_name = "Multiply";
        }
        else if (operator == 4) {
            operator_name = "Divide";
        } else {operator_name = "none";}
        

        if (operator_name == "Sum") {
        	result = sum(firstNum,secondNum);}
        else if (operator_name == "Subtract") {
            result = subtract(firstNum,secondNum);            
        } 
        else if (operator_name == "Multiply") {
            result = multiply(firstNum,secondNum);            
        }
        else if (operator_name == "Divide") {
            result = divide(firstNum,secondNum);            
        }
        else {result = 0;}

        
        System.out.println("The first number entered was "+firstNum);

        System.out.println("The second number entered was "+secondNum);
        
        System.out.println("The operator chosen was "+operator_name);
        
        System.out.println("The result is "+ result);
		
	}

}