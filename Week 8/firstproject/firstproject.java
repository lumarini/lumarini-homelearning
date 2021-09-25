//WEEK 7 

package firstproject;
import java.util.Scanner;

public class firstproject {
	
	public static int calcsum(int p, int q) {
		 int r = p+q;
		 return r;
		}
	
	public static int maxValue(int n, int m) {
		if (n>m) {
			return n;
		} else return m;
	}
	
	public static boolean firstIsGreater (int g, int h) {
		if (g>h) {
			return true;
		} else return false;
	}

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		//Comments initiate with 2 forward slashes
		/*bigger (multi-line) comms are 
		 * between fwd slash-star */
		
		//Variables:
		
		String name = "Luciana";
		int age = 35;
		float agebyten = 3.5f;
		char initial = 'l';
		boolean paytaxes = true;
		
		
		System.out.println("My name is "+name+" and I am "+age+" years old. "
				+ "My age divided by 10 is "+agebyten+" and the first letter of my name is "+initial+"." );
		
		int a = 5;
		int b = 6;
		System.out.println(a+b);
		//Sum of 2 integers
		
		String c = "5";
		String d = "6";
		System.out.println(c+d);
		//concatenating 2 strings
		
		char x = '5';
		char y = '6';
		System.out.println(x+y);
		//why sum of 2 chars is 107 ???
		
		//byte min and max values
		Byte minimumByteValue = Byte.MIN_VALUE;
		Byte maximumByteValue = Byte.MAX_VALUE;
		System.out.println("Minimum byte value is : " + minimumByteValue);
		System.out.println("Maximum byte value is : " + maximumByteValue);

		//short min and max values
		Short minimumShortValue = Short.MIN_VALUE;
		Short maximumShortValue = Short.MAX_VALUE;
		System.out.println("Minimum short value is : " + minimumShortValue);
		System.out.println("Maximum short value is : " + maximumShortValue);

		//literals
		int aa = 101; // decimal-form literal - 101
        int bb = 0100; // octal-form literal - 64
        int cc = 0xFace; // Hexa-decimal form literal - 64206 
        int dd = 0b1111; // Binary literal -15
        System.out.println(aa); 
        System.out.println(bb); 
        System.out.println(cc); 
        System.out.println(dd); 	
        
        calcsum(9,8);
        //calling method calcsum
        System.out.println(calcsum(9,8));
        
        //calling method maxValue
        System.out.println(maxValue(20, 30));
        
        //calling method firstIsGreater
        System.out.println(firstIsGreater (40, 30));
        System.out.println(firstIsGreater (30, 31));
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        int firstNum, secondNum;
        
        firstNum = s.nextInt();
        
        System.out.println("Enter another number here:");
        
        secondNum = s.nextInt();
        
        System.out.println("The first number entered was "+firstNum);

        System.out.println("The second number entered was "+secondNum);
        
        System.out.println("The sum of both numbers is "+ (firstNum+secondNum));
        
        System.out.println("Calling sum method: "+ (calcsum(firstNum,secondNum)));
        
        System.out.println("Calling firstIsGreater method: "+ (firstIsGreater(firstNum,secondNum)));
        

	}

}