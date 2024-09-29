package exceptionhandling;

public class Exceptionconcept {

	public static void main(String[] args) {
		
		//we can put runtime exception so that we can get to know what kind of exception will getting in run time
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]); // This will throw an exception because index 10 doesn't exist.
		} catch (RuntimeException e) {
			System.out.println("Array Index is Out Of Bounds");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("This line gets printed regardless of an exception was thrown or not.");
		}

	}

}
