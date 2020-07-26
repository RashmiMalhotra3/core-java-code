package Collections;


import java.util.Iterator;

// Java program to demonstrate a Queue 

import java.util.PriorityQueue; 

public class QueueExample {


	public static void main(String args[]) 
    { 
        // Creating empty priority queue 
        PriorityQueue<String> cities = new PriorityQueue<String>(); 
  
        // Adding items to the pQueue using add() 
        cities.add("Mysuru"); 
        cities.add("Toronto"); 
        cities.add("Dublin"); 
        cities.add("Singapore");
        cities.add("Nairobi");
        
        
  
        // Printing the top element of PriorityQueue 
        System.out.println("Top of the list: "+cities.peek()); 
  
        //loop thru all elements
        System.out.println("Complete list:");
        Iterator <String>  itr = cities.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        // Printing the top element and removing it 
        // from the PriorityQueue container 
        System.out.println("Removing this top item: "+cities.poll()); 
  
        // Printing the top element again 
        System.out.println("Look at the top again: " +cities.peek()); 
    } 
} 
