package polymorphism;

public class Polymorph {
	
	public static void display() {
		System.out.println("displaying");
	}
	

	public static void main(String[] args) {
		
		display();
		
		// Method overloading intialization
		Overloading over = new Overloading();
		// Method overloading calling
		System.out.println("The value of a is" +" "+over.a);
		over.sum();
		over.sum(1, 2);
		over.sum(1.3, 2);
		over.sum(2, 1.3);
		over.sum(2, 4, 5);
		// Constructoroverloading
		ConstructorOverloading cnstr = new ConstructorOverloading();
		cnstr.addingthreenumbers(1, 2, 3);

		System.out.println(cnstr.multiplynumbers(705, 8));

		// Encapuslation calling
		Encapsulation enc = new Encapsulation();
		enc.setA(1);
		System.out.println("The value of a is" + " " + enc.getA());
		enc.setB("Proted class");
		System.out.println("This is " + " " + enc.getB());
		


	}

}
