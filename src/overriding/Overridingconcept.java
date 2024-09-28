package overriding;

//method overriding
class A{
	
	int a;
	
	A(int a){
		this.a=a;
	}

	void display(int a,int b) {
		int c=this.a+a;
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
}

class B extends A {
	B(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	void display(int a) {
		int c=this.a+a;
		System.out.println(this.a);
		System.out.println(c);
	}
}

class C {
	
}

public class Overridingconcept {
	

	public static void main(String[] args) {
//		A first= new A(7);
//		first.display(1,5);
		B Second = new B(8);
		Second.display(9);
//		B Second = new B();
//		System.out.println(Second.age(21));
	}

}
