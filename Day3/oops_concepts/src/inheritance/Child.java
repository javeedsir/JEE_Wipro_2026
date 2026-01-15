package inheritance;

public class Child extends Parent {
	
	public Child() {
		super(); // Parent();
		System.out.println("Child obj created..");
		
	}
	
	public void m2() {
		
		System.out.println("m2() is called from Child");
		
	}

}
