package keyword;

public class StaticMain {
	
	static int a=10;
	static int b=20;
	int c;
	
	static void display() {
		System.out.println("I am harish");
	}
	
	void display1() {
		a=30;
		b=50;
		System.out.println(a);
		display();
	}
	
	

	public static void main(String[] args) {
		System.out.println(a);
		display();
		StaticMain stm=new StaticMain();
		a=40;
		stm.display1();
		StaticMethod.d=60;
		System.out.println(StaticMethod.d);
		StaticMethod.displayotm();
		
		
	}

}
