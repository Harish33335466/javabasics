package methods;

public class Variableapproach {
	
	//Setting values to the class variables.. so that we can many methods
	
	int rollno;
	String name;
	String course;
	String Company;
	
	
	//1 display data -- variable value sets in main method
	void displaydata() {
		System.out.println(name + course + rollno);
	}
	
	//2 Setting value to class variable using any method
	
//	void setdata(int a, String nam, String Crs) {
//		rollno=a;
//		name=nam;
//		course=Crs;
//		
//	}
	
	//In the same way we can use the constructor to setting up the varialbe value
	//By using the constructor we can achieve this
	
//	Variableapproach(int a, String nam, String Crs,String cmpy){
//		rollno=a;
//		name=nam;
//		course=Crs;
//		Company=cmpy;
//		
//	}
	
	
	
	//differentiating constructor vs paramterized constructor
	
	//Default constructor it doesn't accept any paramter but just helps us to achieve initialize the variables to the class
	int x;
	int y;
	
//	Variableapproach(){
//		x=100;
//		y=200;
//	
//	}
	
	void displaytwonumbers() {
		System.out.println(x+y);
	}
	
	//parameterized constructor basically it helps us to get the parameter from main class during object creation. It accepts the parameter and intiliazes the variable into class variables
	
	int g;
	int h;
	int i;
	Variableapproach(int d,int e, int f){
		g=d;
		h=e;
		i=f;
	}
	
	void addingtwonumbers() {
		System.out.println(g+h+i);
	}
	

}
