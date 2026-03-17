package arrays;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] array = new Product[n];
		
		for(int i =0; i < array.length; i++) {
			sc.nextLine();
			String name = sc.next();
			double price = sc.nextDouble();
			array[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i].getPrice();
		}
		
		double average = sum / array.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", average);
		
		
		sc.close();
	}
}
