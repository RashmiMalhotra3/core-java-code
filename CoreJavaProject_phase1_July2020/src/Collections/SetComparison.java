package Collections;

	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.Set;
	import java.util.TreeSet;

	/**
	 * Java program to demonstrate difference between TreeSet, HashSet and LinkedHashSet
	 * in Java Collection.
	 */
	public class SetComparison {
	 
	    public static void main(String args[]){            
	        HashSet<String> gadgetStore = new HashSet<String>();
	        LinkedHashSet<String> gadgetMarket = new LinkedHashSet<String>();
	        TreeSet<String> gadgetBuzz = new TreeSet<String>();
	     
	        for(String gadget: Arrays.asList("smartphone", "tablet", "smartwatch")){
	            gadgetStore.add(gadget);
	            gadgetMarket.add(gadget);
	            gadgetBuzz.add(gadget);
	        }
	       
	        //no ordering in HashSet – elements stored in random order
	        System.out.println("Ordering in HashSet :" + gadgetStore);

	        //insertion order or elements – LinkedHashSet stored elements in order of insertion
	        System.out.println("Order of element in LinkedHashSet :" + gadgetMarket);

	        //should be sorted order – TreeSet stores element in sorted order
	        System.out.println("Order of objects in TreeSet :" + gadgetBuzz);
	        
	        System.out.println("gadgetBuzz contains smartwatch: "+gadgetBuzz.contains("smartwatch"));
	        System.out.println("gadgetMarket contains Fitbit: " + gadgetMarket.contains("Fitbit"));
	    }
	    
	}
