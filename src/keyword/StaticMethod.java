package keyword;

public class StaticMethod {
	
	public static int d=200;
	static int e;

	static void displayotm() {
		System.out.println("I am just displaying this method from other class");
	}

	public static void main(String[] args) {
		System.out.println(d);
	}
}
