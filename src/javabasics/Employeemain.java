package javabasics;

public class Employeemain {

	public static void main(String[] args) {
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
	}

}
