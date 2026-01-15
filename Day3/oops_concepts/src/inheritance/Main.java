package inheritance;

public class Main {

	public static void main(String[] args) {

		int x = 10;

		Object obj = new Object(); 
		
		System.out.println(obj.toString()); // obj.toString()
		
		Parent p = new Parent();
		
		p.m1();
		
		
		//System.out.println(p.toString()); // p.toString();
		
		Child c = new Child();
		
		System.out.println(c); // c.toString();
		
		c.m1();
		
		// Object class toString() print hashcode
		   System.out.println(p.toString());
		   
		   obj = new Parent(); // runtime polymorphism
		   
		   obj = new Child();
		   
		   p = new Child(); // runtime polymorphism
		   
		   
		 
		   
		   Parent p1 =  new Child();
		   
		   Child c1 =  (Child)p1;
		   
		   
		   
		  
		   
		
	}

}
