package entities;

public class  CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double dollarInReal(double price, double amount) {
		double totalBruto = amount * price;
		return totalBruto + (totalBruto * IOF);
	}
}
