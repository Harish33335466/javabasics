package polymorphism;

public class ConstructorOverloading {
	int width;
	int height;
	int depth;
	int first;
	int second;
	
	
	ConstructorOverloading(){
		width=height=depth=2;
	}
	
	ConstructorOverloading(int a, int b,int c){
		width=a;
		height=b;
		depth=c;
		
	}
	ConstructorOverloading(int x,int y){
		first=x;
		second=y;
		
	}
	
	
	
	void addingthreenumbers(int width, int height, int depth){
		System.out.println(width+height+depth);
	}
	
	int multiplynumbers(int first,int second) {
		return(first*second);
	}
}
