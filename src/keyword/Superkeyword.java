package keyword;


class A{
	int a=20;
	void display() {
		System.out.println("I am printing something");
	}
	
}

class B extends A{
	int a=50;
	int b=super.a; //getting old values from parent class
	@override
	void display() {
		super.display();
		System.out.println("I am printing something in B class");
	}
}

//Super constructor must know
class Parent {
    int a;
    
    // Parent class constructor
    Parent(int num) {
        this.a = num;
    }
}

class Child extends Parent {
    int b;
    Child(int num1, int num2) {
        super(num1);  // calling Parent class constructor
        this.b = num2;
    }
    
    void display(int b) {
    	int d=this.a*10+b;
    	System.out.println(d);
    }
    
    int additionoftwonumbers() {
    	return(this.a+this.b);
    }
}


public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println(a.a);
		B b=new B();
		System.out.println(b.a); // getting old values from immediate parent class using super keyword
		b.display();
		Child ch= new Child(10,20);
		System.out.println(ch.b);
		Parent pt=new Parent(1);
		System.out.println(pt.a);
		ch.display(5);
		System.out.println(ch.additionoftwonumbers());
		
		

	}

}
