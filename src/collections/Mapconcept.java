package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapconcept {	

	public static void main(String[] args) {
		// Create a Map using the HashMap class
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("Apple", 1); // String key, Integer value
        map.put(123, "Banana"); // Integer key, String value
        map.put(45.6, null); // Double key, Null value

        // Display the Map
        System.out.println(map); // Output: {45.6=null, Apple=1, 123=Banana}

        // size(): Returns the number of key-value mappings in this map.
        System.out.println(map.size()); // Output: 3

        // containsKey(Object key): Returns true if this map contains a mapping for the specified key.
        System.out.println(map.containsKey("Apple")); // Output: true

        // containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
        System.out.println(map.containsValue("Banana")); // Output: true

        // get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
        System.out.println(map.get(123)); // Output: Banana

        // remove(Object key): Removes the mapping for the specified key from this map if present.
        map.remove("Apple");
        System.out.println(map); // Output: {45.6=null, 123=Banana}

        // clear(): Removes all of the mappings from this map.
        map.clear();
        System.out.println(map); // Output: {}

        // isEmpty(): Returns true if this map contains no key-value mappings.
        System.out.println(map.isEmpty()); // Output: true
        
     // Create a HashMap
        HashMap<Object, Object> map1 = new HashMap<Object, Object>();

        // put(Object key, Object value): Insert entries into the map
        map1.put("Apple", 1); // String key, Integer value
        map1.put(123, "Banana"); // Integer key, String value
        map1.put(45.6, null); // Double key, Null value
        
        

        // Display the map
        System.out.println(map1); // Output: {45.6=null, Apple=1, 123=Banana}
        // size(): Get the number of entries in the map
        System.out.println(map1.size()); // Output: 3

        // containsKey(Object key): Check if a key is in the map
        System.out.println(map1.containsKey("Apple")); // Output: true

        // containsValue(Object value): Check if a value is in the map
        System.out.println(map1.containsValue("Banana")); // Output: true

        // get(Object key): Fetch the value mapped by a particular key
        System.out.println(map1.get(123)); // Output: Banana

        // remove(Object key): Remove an entry from the map
        map1.remove("Apple");
        System.out.println(map1); // Output: {45.6=null, 123=Banana}

        // clear(): Remove all entries from the map
        map1.clear();
        System.out.println(map1); // Output: {}

        // isEmpty(): Check if the map is empty
        System.out.println(map1.isEmpty()); // Output: true
        
        //get all the keys from hashmap
        //return only key values
        System.out.println("getting all values from"+map1.keySet());
        
        //get all the values from hashmap
        System.out.println(map1.values());
        //get all the key value pairs as value from hashmap
        
        System.out.println(map1.entrySet());
        
        
	}

}
