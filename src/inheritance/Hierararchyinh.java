package inheritance;

//hierarachy - one parent can have multiple child class

class First {
	int a;
	int b;
	
	void display() {
		System.out.println("I am from first class");
	}
}

class Second extends First{
	int c;
	void display() {
		System.out.println("I am from third class");
	}
}

class Third extends Second{
	int d;
	void display01() {
		System.out.println("I am from fourth class");
	}
}


public class Hierararchyinh {

	public static void main(String[] args) {
		First ft= new First();
		ft.display();
		Second sec= new Second();
		sec.display();
		Third thr= new Third();
		thr.display01();

	}

}
