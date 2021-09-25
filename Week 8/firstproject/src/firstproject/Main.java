package firstproject;
import java.util.*;

class Main {

	public static void main(String[] args) {
		
		Cars myCar = new Cars(4, "blue");
		myCar.color = "black";
		myCar.isConvertible = true;
		
		Professional teacher = new Professional();
		teacher.salary = 26000;
		teacher.hoursPerWeek = 37.5f;
		teacher.duties = "to teach children how to read";
		
		Professional painter = new Professional();
		painter.payday = "5th of the month";
		
		//Car class
		System.out.println("Print attributes from new myCar object created from Car class:");
		System.out.println(myCar.numOfWheels);
		System.out.println(myCar.color);
		System.out.println(myCar.isConvertible);
		
		//Professional class
		System.out.println("Print attributes from objects created using Professional class:");
		System.out.println("Mrs Alderson earns "+teacher.salary+" per year for working "+teacher.hoursPerWeek+" hour per week and her duties include "+teacher.duties+".");
		System.out.println("Most professionals receive on "+teacher.payday+", except for the painter, who asked to be paid on "+painter.payday+".");
		System.out.println("They had also asked to set taxes payment from "+painter.pay_taxes+" to false, but it was not possible, as this variable was declared as 'final'.");
		
		//Call method from Professional class from teacher object created above
		teacher.work(teacher.duties);
		
		Cars anotherCar = new Cars(2, "red");
		System.out.println(anotherCar.color);
		
		//New object class Cutlery, superclass KitchenUtensils
		Cutlery knife = new Cutlery();
		knife.usedFor = "cut solid foods";
		knife.usedForEatingMeat = true;
		knife.ability(knife.usedFor);
		
		//New object of class Electric Appliances, superclass Kitchen utensils
		ElectricAppliances slowCooker = new ElectricAppliances();
		slowCooker.usedFor = "cook things slowly and steadly.";
		slowCooker.noisy = false;
		slowCooker.voltage = "220v";
		slowCooker.ability(slowCooker.usedFor);
		
		//Example of Polymorphism: same method from superclass KitchenUtensils used for 2 different objects from 2 different subclasses, with different result.
		             
		knife.ability(knife.usedFor);
		slowCooker.ability(slowCooker.usedFor);
		
		//Scanner class to get user's input
	    Scanner num = new Scanner(System.in);
	    
	    System.out.println("Enter a number from 0-9");
	    
	    int enteredNumber = num.nextInt();
		
	    try {
		      if (enteredNumber % 2 == 0) {
		    	  System.out.println("The number "+enteredNumber+" is an even number");
		      } else  {
		    	  System.out.println("The number "+enteredNumber+" is an odd number");
		      }
		    } catch (InputMismatchException e) {
			      System.out.println("The input was invalid, only numbers are accepted");
			      num.next();
			      }
	}
}	    
	   
		

