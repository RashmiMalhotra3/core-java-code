package BasicOps;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter y / n:");
		char resp = s1.nextLine().charAt(0);
		if(resp == 'y') {
			System.out.println("You entered Yes!");
		}
		else {
			System.out.println("You entered no");
		}
		s1.close();

	}

}
