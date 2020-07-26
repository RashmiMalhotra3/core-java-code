package BasicOps;

import java.util.Scanner;

public class ConvertStringToInt {
	
		public static void main(String args[]) {
			System.out.println("Enter some value:");
			Scanner s1 = new Scanner(System.in);
			String input = s1.nextLine();
			
			int i = Integer.parseInt(input);
			System.out.println("Converted string to int:"+i);
			s1.close();
		}
	}
