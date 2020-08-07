package Inheritance;

public class ServiceVehicle {
	public static void main(String args[]){
		AbstractVehicleClass v1 = new Motorbike();
		System.out.println("Ordering tires for Motorbike");
		v1.OrderTires();
		
		Sedan s1 = new Sedan();
		System.out.println("Ordering tires for Sedan");
		s1.OrderTires();
	   }
}
