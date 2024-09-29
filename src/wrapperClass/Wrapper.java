package wrapperClass;

public class Wrapper {
	
	private static String es;

	//Scenario-1 --> String --> int,double,boolean,char
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. String to int but the data should be 
		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		//2. int to decimal/float
		String s3="10.5";
		String s4="20.5";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		//3. if true or false came as string then only convert that into Boolean
		String s="Welcome"; //other than true if you pass anything as string that result as false only
		String t="true";
		String f="false";
		System.out.println(Boolean.parseBoolean(s));
		System.out.println(Boolean.parseBoolean(t));
		System.out.println(Boolean.parseBoolean(f));
		
		//primitive type to String 
		//int,double,short,char,Boolean to String;
		
		//int,double,bool,char to STring
		int a=1;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String so=String.valueOf(a);
		System.out.println(so);
		
		so=String.valueOf(c);
		System.out.println(so);
		
		

	}

}
;
