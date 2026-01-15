package inheritance;

public class Parent extends Object {
	
	
	public Parent(){
		super(); // Object()
			System.out.println("Parent class obj created...");
		
	}
	
	protected Object m1() {
		
		System.out.println("m1() from Parent");
		
		return new Object();
		
	}
	
	@Override
	public String  toString() {
		
		
		return "javeed";
		
	}
	
	
	

}
