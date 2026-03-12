package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Question06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bank bank = null;

		System.out.print("Enther the account number: ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Enther the account name: ");
		String name = sc.nextLine();

		System.out.println("Is there na initial deposit (y/n)?");
		char question = sc.next().charAt(0);

		if (question == 'y') {
			System.out.println("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			 bank = new Bank(number, name, initialDeposit);
			
		} else if (question == 'n') {
			bank = new Bank(number, name);
		}

		System.out.println("Account data: ");
		System.out.println(bank.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		
		System.out.println("Update account data: ");
		System.out.println(bank);

		System.out.print("Enter a withdraw value: ");
		double withdrahValue = sc.nextDouble();
		bank.withdraw(withdrahValue);
		
		System.out.println("Update account data: ");
		System.out.println(bank);

		
		sc.close();
	}
}
