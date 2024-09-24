package javabasics;
public class Oopspart01 {
	
	//Variables
	public int empid;
	public String empname;
	public String designation;
	public int sal;
	
	//Methods
	//void no return value just print the value
	public void display(){
		System.out.println("His employee id is" + empid);
		System.out.println("Employee name is" + empname);
		System.out.println("Employee designation is" + designation);
		System.out.println("Employee inhand salary is" + sal);
	}
	
	//without main method we can't execute the class 
	//whenever we started to created an object. we should create inside the main method only
	//one method doesn't have other method inside
	// class contain multiple method
	//objects should be created inside to the main method

//	public static void main(String[] args) {
//		Oopspart01 empclass=new Oopspart01(); //object
//		empclass.designation="QA Analyst";
//		empclass.empid=00123454;
//		empclass.empname="Harish";
//		empclass.sal=40000;
//		empclass.display();
//		
//		Oopspart01 empclass2=new Oopspart01();
//		empclass2.designation="Data Analyst";
//		empclass2.empid=4345666;
//		empclass2.empname="keer";
//		empclass2.sal=80000;
//		empclass2.display();
//		
//	}

}
