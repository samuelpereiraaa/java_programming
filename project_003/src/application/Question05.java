package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Question05 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarInReal(price, amount);
		
		System.out.printf("Amount to be paid in reais = $%.2f", result);
		
		sc.close();
	
	}
	
}
