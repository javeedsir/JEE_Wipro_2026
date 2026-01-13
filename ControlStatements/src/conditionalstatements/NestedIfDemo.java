package conditionalstatements;

public class NestedIfDemo {

	public static void main(String[] args) {

		
		int a = 8;
		
		if(a > 10 ) {
			
			if( a%2 == 0) {
				
				System.out.println("a is greater than 10");
				System.out.println("a is an even number");
			}
			else {
				
				System.out.println("a is odd number");
			}
			
			
		}
		
		else {
			
			System.out.println("a is not greater than 10");
		}
		
		

	}

}
