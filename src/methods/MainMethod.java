package methods;

public class MainMethod {

	public static void main(String[] args) {
		
		//1. Related to method linking to JavaMethods
		
//		JavaMethods jvm=new JavaMethods();
//		jvm.display();
//		System.out.println(jvm.display1());
//		jvm.display2(3, 4, 5,"Harish");
//		System.out.println(jvm.m4("Hogarth"));
		
		//2.Store data value to class approaches
		
//		Variableapproach var=new Variableapproach(10,"Harish","Msc","Hogarth");
		Variableapproach var=new Variableapproach(1,2,3);
		//setting variable values which belongs to the class
		
		
		//using object reference variables setting values to class varialbes
//		
//		var.rollno=123;
//		var.name="Harish";
//		var.course="Msc";

		
//		//Approach-1
//		System.out.println(var.course);
		//Apporach-2 setting value to the class variable using any method
//		var.setdata(123,"Harish","MSC");
//		var.displaydata();
		//Approach-3 - using constructor
		var.displaydata();
		System.out.println(var.Company);
		
		var.displaytwonumbers();
		System.out.println(var.x);
		var.addingtwonumbers();

	}

}
