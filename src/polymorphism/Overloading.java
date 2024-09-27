package polymorphism;

public class Overloading {
	
	//1. Method overloading definition
	int a=10,b=20;
	//without parameter
	void sum() {
		System.out.println(a+b);
	}
	//Rule 1. Sending two parameter
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	//Rule 2. Sending two different parameters

	void sum(double a, int b) {
		System.out.println(a+b);
	}
	
	//Rule 3. Sending two different paramters but order of parameter only differs
	void sum(int a, double b) {
		System.out.println(a+b);
	}
	//Rule 4. Sending multiple paramters instead of two different
	void sum(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	//Return type methods we can see right now
	//without parameter
		

}
