package mix;

import java.util.Scanner;

public class ExitMethod {

	public static void main(String[] args) {
		System.out.print("enter your no: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		
		if(x > 0)
			System.out.println("ok");
		else {
			System.out.println("Invalid input!!");
			System.exit(0);      // terminate the program at this moment 
		
		
	}
		System.out.println("thax");
}
}
