package entities;

import java.util.Scanner;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(){}
	
	public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
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

	public String toString() {
		return this.name + ", $ " + String.format("%.2f", this.price) + ", " + this.quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueStock());
	}
}
