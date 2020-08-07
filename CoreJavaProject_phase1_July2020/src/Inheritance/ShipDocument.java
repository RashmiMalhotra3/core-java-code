package Inheritance;

public class ShipDocument implements ShipmentInterface{
	long pages;
	double cost;
	public void calculateCost() {
		cost = pages * 25;
	}
	public void SetShippingDate() {
		//implement...
	}
}
