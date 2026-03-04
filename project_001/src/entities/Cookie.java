package entities;

public class Cookie extends Product {
	
		public String expirationDate; // usando String para o fluxo do programa!
		public String mark;
		
		public Cookie (String name, double price, int stock, String expirationDate, String mark){
			super(name,price,stock);
			this.expirationDate = expirationDate;
			this.mark = mark;
		
	}
}
