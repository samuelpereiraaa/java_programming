package entities;

public class Chair extends Product {

	public String material;
	public String color;
	
	public Chair (String nome, double price, int stock, String material, String color){
		super(nome,price,stock);
		this.material = material;
		this.color = color;
	}
}
