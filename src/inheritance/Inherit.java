package inheritance;

//Single inheritance

class A{
	int a = 20;

	void display() {
		System.out.println("I am from A class");
	}
}

//Single inheritance only one parent which means A is the parent class B is derived class

class B extends A {
	int b = 20;

	void display1() {
		System.out.println("I am from B class");
	}
}

//multilevel inheritance

class C extends B{
	int c=100;
	
	void display3() {
		System.out.println("I am from C class");
	}
}

class d extends C{
	int f=500;
	void display4() {
		System.out.println("I am from d class");
	}
}

public class Inherit {

	public static void main(String[] args) {
		
		d fourth= new d();
		fourth.display4();

	}

}
