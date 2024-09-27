package polymorphism;

public class Encapsulation {
	
	private int a;
	private String b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public static void anotherMethod() {
		System.out.println("I am executing");
	}
	
}
