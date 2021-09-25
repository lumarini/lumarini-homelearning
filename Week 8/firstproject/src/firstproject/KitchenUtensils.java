package firstproject;

public class KitchenUtensils {
	
	String name;
	String color;
	int quantity;
	float costPerItem;
	String usedFor;
	
	public void ability(String usedFor) {
		System.out.println("This object can "+ usedFor);
	}

}
