package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
		
			String username ;
			String password;
			
		do {
			
			System.out.println("Enter User Name");
			
			 username =	sc.next();
			
            System.out.println("Enter Password");
			
            password =	sc.next();
			
			
		}while(validateUser(username, password));
		

	}

	public static boolean validateUser(String username, String password) {

		boolean flag = false;

		if (username.equals("javeed") && password.equals("tiger")) {

			System.out.println("Login Success , Welcome to Wipro");

			flag = true;
		}

		else {

			System.out.println("Invalid credentials , Login Denied");

		}

		return flag;

	}

}
