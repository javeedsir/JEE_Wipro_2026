package conditionalstatements;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		
		int choice = sc.nextInt();

		switch (choice) {
		case 1:

			System.out.println("Your Token Number is 1");
			break;

		case 2:

			System.out.println("Your Token Number is 2");
			break;
		case 3:

			System.out.println("Your Token Number is 3");
			break;

		default:
			
			System.err.println("Token Number out of range");
			
			break;
		}

		System.out.println("Flow is outside switch now");
		
	}

}
