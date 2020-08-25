import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		
		// create an object
		
		BankAccount object1 = new BankAccount("MOhammad", "987654");
		object1.showMenu();

		
	}

}

class BankAccount {
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	
	// Constructor has the same name of class but no return type!
	
	public BankAccount(String custName, String custId ) {
		
		customerName = custName;
		customerId = custId;
	
	}
	
	
	void deposit (int amount) {
		
		if (amount != 0) {
			
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if (amount != 0) {
			
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		
		else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		
		else {
			System.out.println("No transaction occured!");
		}
	}

	
	void showMenu() {
		
		char option = '\0';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID: " + customerId + "\n");
		System.out.println("A. Check balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("Previous transaction");
		System.out.println("E. Exit");
		
		
		do {
			
			System.out.println("Enter an option: ");
			option = scanner.next().charAt(0);
			
			switch(option) {
			
			case 'A':
				System.out.println("Balance = " + balance + "\n");
				break;
				
			case 'B':
				System.out.println("Enter an amount to deposit: " + "\n");
				int amount = scanner.nextInt();
				deposit(amount);
				break;
				
			case 'C':
				System.out.println("Enter an amount to withdraw" + "\n");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				break;
				
			case 'D':
				getPreviousTransaction();
				break;
				
			case 'E':
				System.out.println("Exiting..." + "\n");
				break;
				
			default:
				System.out.println("Invalid option" + "\n");
				break;
				
			}
			
			
		}while(option != 'E');
		
		
		System.out.println("Thank you for banking with us");
		
	}
	
		
	
}	
