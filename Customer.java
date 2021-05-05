package duke.choice;

public class Customer {
	String name;
	

	public static void main(String[] args) {
		
		double tax = 0.2, total = 0.0;
		
		System.out.println("Welcome to Duke Chioce Shop");

		Customer c1 = new Customer();
		c1.name = "Pinky";
		System.out.println("Customer is " + c1.name);
	
		//creating object
	Clothing item1 = new Clothing();
	Clothing item2 = new Clothing();
	
	
	item1.description = "Blue Jacket";
	item1.price = 20.99;
	item1.size = "M";
	
	item2.description = "Orange T-shirt";
	item2.price = 10.5;
	item2.size = "S";
	
	System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
	System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
	
	// total =  ( item1.price + (item2.price *2) ) * (1 + tax);
	
	int measurement = 3;
	switch (measurement) {
	case 1, 2, 3:
	c1.size = "S";
	break;
	case 4, 5, 6:
	c1.size = "M";
	break;
	c1.size = "L";
	break;
	default:
	
	
	}
	
	System.out.println("Total = " + total);
	
	
	}

}
