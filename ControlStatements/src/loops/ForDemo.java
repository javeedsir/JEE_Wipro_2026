package loops;

public class ForDemo {

	public static void main(String[] args) {
		

			for(int i=0; i < 5; i++) {
				
				System.out.println(i);
				
				if(i%2 == 0) {
					
					System.out.println("if condition true for loop break");
					
					continue;
				}
			}
		

	}

}
