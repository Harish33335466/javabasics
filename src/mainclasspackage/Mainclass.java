package mainclasspackage;
import javabasics.Oopspart01;
import javabasics.Studentclass;
import keyword.StaticMethod;
public class Mainclass {
	public static void main(String[] args) {
		Studentclass stu = new Studentclass(); //object created;
		stu.a=10;
		stu.b=20;
		stu.c=30;
		stu.displaynumbers();
		Oopspart01 empclass=new Oopspart01(); //object
		empclass.designation="QA Analyst";
		empclass.empid=00123454;
		empclass.empname="Harish";
		empclass.sal=40000;
		empclass.display();
		Oopspart01 empclass2=new Oopspart01();
		empclass2.designation="Data Analyst";
		empclass2.empid=4345666;
		empclass2.empname="keer";
		empclass2.sal=80000;
		empclass2.display();	
		
	    System.out.println(StaticMethod.d);
		
	}
}
