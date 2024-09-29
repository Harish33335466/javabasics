package composition;

public class ClassC {
	
	ClassA a = new ClassA();
	ClassB b= new ClassB();
	
	void MethodC() {
		a.firstMethod();
		b.secondMethod();
	}
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.MethodC();
		System.out.println();
	}
}
