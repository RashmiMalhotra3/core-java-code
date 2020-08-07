package Inheritance;

public class ShipStuff {
	
	public static void main(String args[]) {
		ShipContainer c1 = new ShipContainer();
		ShipDocument d1 = new ShipDocument();
		
		// ShipmentInterface i1 = new ShipmentInterface();
		//What happends if I uncomment the above line?
		
		c1.weight = 290;
		c1.calculateCost();
		System.out.println("To ship this container weighing "+c1.weight+" kgs it will cost " + c1.cost);
		
		d1.pages = 700;
		d1.calculateCost();
		System.out.println("To ship this "+d1.pages+" page document, it will cost " + d1.cost);
		
	}
}