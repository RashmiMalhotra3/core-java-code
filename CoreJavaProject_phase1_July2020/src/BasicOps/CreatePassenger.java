package BasicOps;
import java.util.Scanner;
public class CreatePassenger {
	public static void main(String args[]) {
			char response = 'y';
			Scanner s1 = new Scanner(System.in);
			do {
				System.out.println("Enter passenger name:");
				String name = s1.nextLine();
				System.out.println("Enter passenger age:");
				String strage = s1.nextLine();
				int age = Integer.parseInt(strage);
				System.out.println("Enter passenger gender (M/F):");
				String gen = s1.nextLine();
				TrainPassenger tp1 = new TrainPassenger(name, age, (char)(gen.charAt(0)));
				System.out.println("A new passenger was created");
				System.out.println(" Name:"+ tp1.getName());
				System.out.println(" Age:"+ tp1.getAge());
				System.out.println(" pnr:"+ tp1.getPnr());
				System.out.println(" Gender:"+ tp1.getGen());
				System.out.println("Do you want to add another passenger? (y/n):");
				response  = s1.nextLine().charAt(0);
				}
			while (response=='y');
			s1.close();
		}
		
}