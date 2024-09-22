package javabasics;

public class Practice {

	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		b=a;
//		a=(b==10)?20:0;
//		System.out.println(b);
//		System.out.println(a);
		
		 int a = 10;
	     int b = 20;

	        System.out.println("Before swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Swap numbers without using a temp variable
	        a = a + b;  // now a is the sum of a and b
	        b = a - b;  // subtract b from the sum, which leaves the original a value
	        a = a - b;  // subtract the new b (original a) from the sum to get the original b value

	        System.out.println("After swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	}

}
