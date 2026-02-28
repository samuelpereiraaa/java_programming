package entities;

import java.util.Scanner;

public class Products {

	public String name;
	public double price;
	public int quantity;

	public double totalValueStock() {
		return price * quantity;
	}

	public void addProducts(Scanner sc) {
		int addStock;
		System.out.println("Enter the number of products to be added in stock: ");
		addStock = sc.nextInt();
		this.quantity += addStock;
	}

	public void removeProducts(Scanner sc) {
		int removeStock;
		System.out.println("Enter the number of products to be removed from stock: ");
		removeStock = sc.nextInt();
		this.quantity -= removeStock;
	}
}
