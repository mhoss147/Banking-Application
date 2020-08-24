import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// Take input of string
		
		System.out.println("Enter your name: ");
		String name = scanner.next();
		System.out.println("Your name is: " + name);
				
		
		// Take input of number
		
		System.out.println("Enter a age: ");		
		int val = scanner.nextInt();
		System.out.println("Your age: "+ val);
		
		
		// Take input of character
		
		System.out.println("Enter a sex (m/f): ");		
		char x = scanner.next().charAt(0);
		System.out.println("You entered: " + x);
		
		
		

		
		
	}

}
