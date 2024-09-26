package methods;

public class JavaMethods {
	//1 No Params no returns value just printing something
	
	void display() {
		System.out.println("Displaying something ");
	}
	
	//2 No Params returning any data it may be int or String whatever it may be
	String display1() {
		return("Hello world");
	}
	
	//3 Take params no return value 
	//int a, int b, int c, String name -- These are local variable only accessible for this method alone
	void display2(int a, int b, int c,String name) {
		System.out.println(a+b+c+" " +"is"+" "+"his roll number:" +" " + name);
		
	}
	
	//4 Take params and returning String valeu
	
	String m4(String company) {
		return("My company name is" + " "+company);
		
	}
	
	

}
