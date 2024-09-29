package dataabstraction;

interface Shape{
	double length=10.59099; // italic letter means final and static variable
	int width=20;
	
	void circle();
	
	default void square() {
		System.out.println("this is square");
	} //default is allowed 
	
	static void rectangle() {
		System.out.println("this is rectangle-static method");
	}
	
}

public class Interface implements Shape {
	
	//circle has default modifier
	
	//if we declare the public access modifier then only we don't get an error since it comes from parent class which is public
	
	public void circle() {
		System.out.println("I am from circle");
	}

	public static void main(String[] args) {
		
		//Scenario-1
//		Interface id= new Interface();
//		id.circle();
//		id.square();
//		
//		Shape.rectangle();  // we need to mention the interface before to the method name even it's static name because it deosn't not belong to class
		
		//Scenario 2
		Shape sh=new Interface(); // eventhough we can't create an object for interface since it's implemented to the class we can create an object reference on class
		//Object reference vairable can be created for interface.
		
		sh.square();
		sh.circle();
		Shape.rectangle();
		
		//we can access the interface static variables directly without declaring an object
		
		System.out.println(Shape.length+Shape.width);
		
		//we can't acess the class variables and methods using interface this is not possible
		//But in class we can access the interface variable and methods 

	}

}
