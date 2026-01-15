package inheritance;

public class Child extends Parent {
	
	int c;
	
	// examples of compile time polymorphism
	public Child() {
		super(); // Parent();
		System.out.println("Child obj created..");
		
	}
	
	
	
	public Child(int c) { // constructor overloading 
		super();
		this.c = c;
	}



	public void m2() {
		
		System.out.println("m2() is called from Child");
		
	}
	
	public void m2(int x) { // method overloading 
		
		
		System.out.println("m2() overloading");
	}

	
	@Override
	public Child m1() {
		
		System.out.println("m1() overriding in child class");
	
		return new Child();
		
	}
	
	
	
	
	
}
