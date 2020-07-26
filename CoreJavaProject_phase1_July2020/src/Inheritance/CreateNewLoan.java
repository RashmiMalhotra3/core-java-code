package Inheritance;
import java.util.Scanner;
public class CreateNewLoan {

	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
	     System.out.println("Enter loan type (1 for Home | 2 for Car) :");
		 String opt = s1.nextLine();
		 if (opt.matches("1")) {
			 HomeLoan h1 = new HomeLoan("Jay Chand",200000, 120, "345609" );
			 System.out.println(h1.getCustomername());
			System.out.println("EMI is calculated to be:"+h1.calculateEMI("floating"));
		 }
		 else {
		CarLoan l1 = new CarLoan("Henry Ford", 30000, 60, "Benz" );
		System.out.println(l1.getCustomername());
		System.out.println("EMI is calculated to be:"+l1.calculateEMI(2000));
		 }
	}
}
