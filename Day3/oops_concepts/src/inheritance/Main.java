package inheritance;

public class Main {

	public static void main(String[] args) {

		int x = 10;

		Object obj = new Object(); 
		
		System.out.println(obj.toString()); // obj.toString()
		
		Parent p = new Parent();
		
		System.out.println(p.toString()); // p.toString();
		
		Child c = new Child();
		
		System.out.println(c); // c.toString();
		
	}

}
