package Collections;


	// Import the HashMap class
	import java.util.HashMap;
	import java.util.Random;

	public class HashMapExample {
	  public static void main(String[] args) {

	    // Create a HashMap object 
	    HashMap<String, Long> employees = new HashMap<String, Long>();


	    // Add keys and values (Name, ID)
	    employees.put("Amar", new Random().nextLong());
	    employees.put("Sarah", new Random().nextLong());
	    employees.put("Shakir", new Random().nextLong());

	    System.out.println("Amar's employee ID is: "+employees.get("Amar"));
	    
	    for (String i : employees.keySet()) {
	      System.out.println("key: " + i + " value: " + employees.get(i));
	    }
	    
	    //remove all items using clear
	    employees.clear();
	    
	    System.out.println("After clearing, the hashmap's size is: "+employees.size());
	  }
	}
