package project_003;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class ex_001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Products product = new Products();
		
		System.out.println("enter the product data: ");
		
		System.out.println("name: ");
		product.name = sc.nextLine();
		
		System.out.println("price: ");
		product.price = sc.nextDouble();
		
		System.out.println("quantity: ");
		product.quantity = sc.nextInt();
		
		sc.nextLine();

		double resultStock = product.totalValueStock();

		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity,
				resultStock);

		product.addProducts(sc);

		System.out.printf("Update data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity,
				product.totalValueStock());

		product.removeProducts(sc);

		System.out.printf("Update data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity,
				product.totalValueStock());

		sc.close();
	}
}
