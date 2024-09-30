package collections;

import java.util.HashSet;
import java.util.Set;


public class Hashset {
	
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>(); //adding homegenous data to the list following are the list of rules
		// Rule 1: Uniqueness - No duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Apple"); // This will be ignored
        System.out.println(hset); // Output: [Apple, Mango]
     // Rule 2: Null Values - Allows one null value
        hset.add(null);
        hset.add(null); // This will be ignored
        System.out.println(hset); // Output: [null, Apple, Mango]
        // Rule 3: Ordering - No specific ordering
        hset.add("Banana");
        hset.add("Grapes");
        System.out.println(hset); // Output: [null, Banana, Apple, Mango, Grapes] (Order not guaranteed)
     // Rule 4: Iterating - Order of iteration is not guaranteed to remain constant over time
        for(String fruit : hset) {
            System.out.println(fruit);
        }
     
        //accessing and calling interface methods and use it 
        
        Set<String> set = new HashSet<String>(); //Set is an interface and Hashset is an class
        set.add("Harish");
        set.add("Hogarth");
        set.add("Diarymilk");
        set.add("carotine");
        System.out.println(set);
        
        //Remove an element from the set
        set.remove("Harish");
        //isempty returns boolean 
        System.out.println(set.isEmpty());
        System.out.println(set);
        set.clear();
        System.out.println(set);
        Set<String> set2 = new HashSet<String>();
        set2.add("Harish");
        set2.add("chennai");
        System.out.println(set.equals(set2));
	}

}
