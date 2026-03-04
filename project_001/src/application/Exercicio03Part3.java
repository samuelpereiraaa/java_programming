package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Exercicio03Part3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product newProduct = new Product("tv", 900.00, 10);
		
		System.out.println("name of product: " + newProduct.getName());
		System.out.println("price of product: " + newProduct.getPrice());
		System.out.println("stock of product: " + newProduct.getStock());
		sc.close();
	}
}
