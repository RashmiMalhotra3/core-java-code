package BasicOps;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a value");
		String input = s1.nextLine();
		
		float f = Float.parseFloat(input);
		System.out.println("Converted string to float:" + f);
        s1.close(); 
        
        //implicit typecasting or automatic/widening conversion (from smaller to bigger) -       
        int i = 20;
        long l = i;
        float f1 = l;
        System.out.println("Implicit typecasting ->");
        System.out.println("Integer: " + i);
        System.out.println("Integer converted to Long: " + l);
        System.out.println("Long converted to Float: " + f1);
        
        //Explicit typecasting or narrowing conversion (from bigger to smaller) -
        double d =20.99;
        float f2 = (float)d; 
        long l2 = (long)f2;
        int i2 = (int)l2;
        System.out.println("Explicit typecasting ->");
        System.out.println("Double: " + d);
        System.out.println("Double converted to Float: " + f2);
        System.out.println("Float converted to Long: " + l2);
        System.out.println("Long converted to Integer: " + i2);
        
	}

}
