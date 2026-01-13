package conditionalstatements;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in); 
		
		System.out.println("Enter your color");
		
		
		String color =	sc.next();
		
		//	double d =	sc.nextDouble(); //  100.99 <---"100.99"

		if (color.equals("red")) {

			System.out.println("Your Favourite color is Red Available");

		}

		else if (color.equals("blue")) {

			System.out.println("Your Favourite color is Blue Available");

		}

		else if (color.equals("yellow")) {

			System.out.println("Your Favourite color is Yellow Available");

		}
		
		else {
			
			System.out.println("Your Favourite color is not Available");
		}

	}

}
