package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 digit number");
		
		int num =	sc.nextInt();
		
		
		
		int i = 1;
		while( i <= num) {
			
			System.out.println(i);
			
			i++;
			
		}
		
		

	}

}
