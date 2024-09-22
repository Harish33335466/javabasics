package javabasics;

public class Operatorsjava {

	public static void main(String[] args) {
		
		//1) Arithmetic operators + - * / %
		int a=20, b=10;
		System.out.println("Sum of a and b is: "+(a+b));
		System.out.println("Diff of a and b is: "+(a-b));
		System.out.println("Multiplication of a and b is: "+(a*b));
		System.out.println("Division of a and b is:"+(a/b)); //It returns the quotient value once division done
		System.out.println("Modulo division of a and b is: "+(a%b)); //It returns the remainder value once division is done.
		
		//2) Relational/comparison operators
		// returns boolean value - true/false
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		b=20;
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true
		System.out.println(a!=b);//false
		System.out.println(a==b); //true
		
		int c=10;
		int d=30;
		System.out.println(c!=d);
		
		//3) Logical operators && || !
		// returns boolean value true/false
		// works between 2 boolean values
		boolean x=true;
		boolean y=false;
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		boolean b1=10>20;
		System.out.println(b1); //false
		boolean b2=20>10;
		System.out.println(b2); //true
		System.out.println(b1 && b2);
		
		//Ternary operator
		
		int sum1=20;
		int sum2=30;
		int results=(sum1<sum2)?sum1:sum2; // if the output value is true it will provide as a result true if not false
		System.out.println(results);
		
		// Swapping 
		
		int a1;
		a1=110;
		int b11;
		b11=210;
		a1=b11;
		b11=a1;
		System.out.println(a1);
		System.out.println(b11);

	}

}
