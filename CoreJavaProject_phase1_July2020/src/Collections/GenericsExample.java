package Collections;

public class GenericsExample {
	
		   // generic method listArray
		   public static < T > void listArray( T[] argArray ) {
		      // List array elements
		      for(T element : argArray) {
		         System.out.println(element);
		      }
		      System.out.println();
		   }

		   public static void main(String args[]) {
		      // Create arrays of Integer, Double and Character
		      Integer[] intArray = { 1, 2, 3, 4, 5 };
		      Double[] doubleArray = { 1.1, 5.1, 7.5, 9.8 };
		      Character[] charArray = { 'C', 'O', 'O', 'L', '!' };

		      System.out.println("Array integerArray contains:");
		      listArray(intArray);   // arg is Integer array

		      System.out.println("\nArray doubleArray contains:");
		      listArray(doubleArray);   // arg is Double array

		      System.out.println("\nArray characterArray contains:");
		      listArray(charArray);   // arg is Character array
		   }
		}