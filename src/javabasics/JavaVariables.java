package javabasics;

public class JavaVariables {

	public static void main(String[] args) {
		int a=100, b=200;
		System.out.println("the value of a is :"+a);
		System.out.println("the value of b is :"+b);
		System.out.println(a+b);
		System.out.println("the sum of a and b is: "+(a+b));
		
		byte by=125;
		System.out.println(by);
		short sh=3535;
		System.out.println(sh);
		long la=212131231231L;  //l or L Should be mandatory while declaring long variable . literal needs to be there
		System.out.println(la);
		float item_price=15.5F; //f or F should be mandatory while declaring float variable. literal needs to be there 
		System.out.println(item_price);
		
		double dbl=1234.4343412;
		System.out.println(dbl);
		
		char grad='A';
		System.out.println(grad);
		
		String name="John";
		
		//char ch='ABC' ; //invalid
		//String ch='ABC' ; //invalid
		//String ch='A'; //invalid
		String ch = "A";
		System.out.println(name);
		System.out.println(ch);
		
		boolean bl = true;
		boolean al=false;
		System.out.println(bl);
		System.out.println(al);
		
		//In Java, you can declare a variable as "final" to make it a constant. 
		//Once a final variable has been assigned, it always contains the same value. 
		

	}

}
