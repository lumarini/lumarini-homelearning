package firstproject;

public class Professional {
	
	//Attributes for class Professional:
	String payday = "1st of each month";
	final boolean pay_taxes = true;
	int salary;
	float hoursPerWeek;
	String duties;

	//Creating new professionals and finding their inherited attributes
	public static void main(String[] args) {
		Professional worker = new Professional();  // Object 1
		Professional builder = new Professional();  // Object 2
		System.out.println(worker.payday);
		System.out.println(builder.pay_taxes);
	}
	
	public void work(String duties) {
		System.out.println("Please do this: "+duties);
	}
}
