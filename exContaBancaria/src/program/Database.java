package program;

import java.util.Scanner;

import entities.Account;

public class Database {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Account account; 	
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine(); 
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit? (Y/N) ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter inicial value deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account (number, name, initialDeposit); 
		} else {
			account = new Account (number, name);
		}
		
		System.out.println("Account data: ");
		System.out.println(account);	
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositvalue = sc.nextDouble();
		account.deposit(depositvalue);
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
				System.out.println("Enter a withdraw value: ");
				double withdrawvalue = sc.nextDouble();
				account.withdraw(withdrawvalue);
				System.out.println();
				
				System.out.println("Updated account data: ");
				System.out.println(account);
		
		
		sc.close();

	}

}
