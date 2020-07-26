package Collections;


	import java.util.ArrayList;
	import java.util.Collections;  // Import the Collections class
	
	public class ArrayListExample {
	  public static void main(String[] args) {
	    //ArrayList<String> cars = new ArrayList<String>();
		  ArrayList<String> cameras = new ArrayList<String>();
	    cameras.add("Nikon");
	    cameras.add("Panasonic");
	    cameras.add("Canon");
	    cameras.add("Sony");
	    
	    System.out.println("Size of our array list is: "+cameras.size());
	    System.out.println("First element in the list is: " + cameras.get(0));
	    
	    System.out.println("Before sorting");
	    for (String i : cameras) {
		      System.out.println(i);
		    }
	    Collections.sort(cameras);  // Sort
	    
	    System.out.println("After sorting");
	    for (String i : cameras) {
	      System.out.println(i);
	    }
	    
	    //replace 2nd element
	    cameras.set(1, "Konica");
	    System.out.println(cameras);
	  }
	}