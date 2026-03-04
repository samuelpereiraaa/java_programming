package entities;

public class Product {

	private String name;
	private double price;
	private int stock;

	public Product(String name, double price, int stock) {

		this.name = name;
		this.price = price;
		this.stock = stock;

	}
	
	public String toString() {
		return "name of product: " + 
				this.name +
				String.format("%nprice of product $ %.2f", this.price);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void applyDiscount() {
		this.price -= 10;
	}

	public void reduceStock() {
		this.stock -= 1;
	}
}
