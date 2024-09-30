package collections;

import java.util.HashSet;
import java.util.Set;

public class Hashsethetero {

	public static void main(String[] args) {
		// Create a Set using the HashSet class
        Set<Object> set = new HashSet<Object>();
        
     // Add elements to the Set
        set.add("Apple"); // String
        set.add(123); // Integer
        set.add(45.6); // Double
        set.add(null); // Null value

        // Display the Set (no specific order guaranteed for HashSet)
        System.out.println(set); // Output: [null, Apple, 123, 45.6]

        // size() - Returns the number of elements in this set
        System.out.println(set.size()); // Output: 4

        // contains(Object o) - Returns true if this set contains the specified element
        System.out.println(set.contains(123)); // Output: true
        System.out.println(set.contains("Banana")); // Output: false

        // remove(Object o) - Removes the specified element from this set if it is present
        set.remove(123);
        System.out.println(set); // Output: [null, Apple, 45.6]

        // isEmpty() - Returns true if this set contains no elements
        System.out.println(set.isEmpty()); // Output: false

        // clear() - Removes all of the elements from this set
        set.clear();
        System.out.println(set); // Output: []

        // Check if the set is empty after clearing all elements
        System.out.println(set.isEmpty()); // Output: true
        
        HashSet<String> hset = new HashSet<String>();

        // Using add()
        hset.add("Apple");
        hset.add("Mango");

        // Using size()
        System.out.println(hset.size()); // Output: 2

        // Using contains()
        System.out.println(hset.contains("Apple")); // Output: true

        // Using remove()
        hset.remove("Apple");

        // Using isEmpty()
        System.out.println(hset.isEmpty()); // Output: false

        // Using clear()
        hset.clear();
        System.out.println(hset.size()); // Output: 0

	}

}
