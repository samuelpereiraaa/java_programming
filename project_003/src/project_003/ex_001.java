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
