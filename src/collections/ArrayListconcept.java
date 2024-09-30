package collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListconcept {

	public static void main(String[] args) {
		 // Create a List using the ArrayList class
        List<Object> list = new ArrayList<Object>();
     // Add elements to the List
        list.add("Apple"); // String
        list.add(123); // Integer
        list.add(45.6); // Double
        list.add(null); // Null value

        // Display the List
        System.out.println(list); // Output: [Apple, 123, 45.6, null]

        // size() - Returns the number of elements in this list
        System.out.println(list.size()); // Output: 4

        // contains(Object o) - Returns true if this list contains the specified element
        System.out.println(list.contains(123)); // Output: true
        System.out.println(list.contains("Banana")); // Output: false

        // remove(Object o) - Removes the first occurrence of the specified element from this list, if it is present
        list.remove((Object)123);
        System.out.println(list); // Output: [Apple, 45.6, null]

        // get(int index) - Returns the element at the specified position in this list
        System.out.println(list.get(0)); // Output: Apple

        // set(int index, E element) - Replaces the element at the specified position in this list with the specified element
        list.set(0, "Banana");
        System.out.println(list); // Output: [Banana, 45.6, null]

        // add(int index, E element) - Inserts the specified element at the specified position in this list
        list.add(1, "Orange");
        System.out.println(list); // Output: [Banana, Orange, 45.6, null]

        // indexOf(Object o) - Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
        System.out.println(list.indexOf("Orange")); // Output: 1

        // clear() - Removes all of the elements from this list
        list.clear();
        System.out.println(list); // Output: []

        // isEmpty() - Returns true if this list contains no elements
        System.out.println(list.isEmpty()); // Output: true
        
        ArrayList<Object> list1 = new ArrayList<Object>();

        // add(Object o): Appends the specified element to the end of this list.
        list1.add("Apple"); // String
        list1.add(123); // Integer
        list1.add(45.6); // Double
        list1.add(null); // Null value

        // size(): Returns the number of elements in this list.
        System.out.println(list1.size()); // Output: 4

        // contains(Object o): Returns true if this list contains the specified element.
        System.out.println(list1.contains(123)); // Output: true

        // get(int index): Returns the element at the specified position in this list.
        System.out.println(list1.get(1)); // Output: 123

        // indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(list1.indexOf("Apple")); // Output: 0

        // remove(int index): Removes the element at the specified position in this list.
        list1.remove(1);
        System.out.println(list1); // Output: [Apple, 45.6, null]

        // set(int index, E element): Replaces the element at the specified position in this list with the specified element.
        list1.set(0, "Banana");
        System.out.println(list1); // Output: [Banana, 45.6, null]

        // clear(): Removes all of the elements from this list.
        list1.clear();
        System.out.println(list1); // Output: []

        // isEmpty(): Returns true if this list contains no elements.
        System.out.println(list1.isEmpty()); // Output: true
		
	}

}
