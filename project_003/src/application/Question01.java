package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Question01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the product data: ");
		
		System.out.print("name: ");
		String name = sc.nextLine();
		
		System.out.print("price: ");
		double price = sc.nextDouble();
		
		System.out.print("quantity: ");
		int quantity = sc.nextInt();
		
		sc.nextLine();
		
		Product product = new Product(name,price,quantity);
		product.setName("PC");
		product.getName();
		
		System.out.println("Product data: " + product);
		System.out.println();

		product.addProducts(sc);

		System.out.println("Update data: " + product);
		System.out.println();
		
		product.removeProducts(sc);

		System.out.println("Update data: " + product);
		System.out.println();

		sc.close();
	}
}
