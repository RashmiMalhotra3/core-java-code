package Collections;


	// Import the HashMap class
	import java.util.HashMap;
	import java.util.Random;

	public class HashMapExample {
	  public static void main(String[] args) {

	    // Create a HashMap object 
	    HashMap<String, Long> employees = new HashMap<String, Long>();


	    // Add keys and values (Name, ID)
	    employees.put("Amar", new Random().nextLong() & Long.MAX_VALUE);
	    employees.put("Sarah", new Random().nextLong() & Long.MAX_VALUE);
	    employees.put("Shakir", new Random().nextLong() & Long.MAX_VALUE);
	    employees.put("John", new Random().nextLong() & Long.MAX_VALUE);
	    employees.put("John", new Random().nextLong() & Long.MAX_VALUE);

	    System.out.println("Amar's employee ID is: "+employees.get("Amar"));
	    
	    for (String i : employees.keySet()) {
	      System.out.println("key: " + i + " value: " + employees.get(i));
	    }
	    
	    System.out.println(employees);
	    employees.remove("John");
	    System.out.println(employees);
	    
	    boolean b = employees.containsValue("5691161177853355428");
	    System.out.println(b);
	    
	    //remove all items using clear
	    employees.clear();
	    
	    System.out.println("After clearing, the hashmap's size is: "+employees.size());
	    
	  }
	}
