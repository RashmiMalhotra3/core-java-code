package Inheritance;

public class ShipContainer implements ShipmentInterface {
	double weight;
	double cost;
	public void calculateCost() {
		cost = weight * 100;
	}
	public void SetShippingDate() {
		//implement...
	}
}
