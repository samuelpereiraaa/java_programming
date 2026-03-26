package application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoNacional;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> carrinho = new ArrayList<>();
		
		carrinho.add(new ProdutoNacional("Arroz", new BigDecimal("20.00")));	
		carrinho.add(new ProdutoImportado("telefone", new BigDecimal("100.00")));
		
		
		
		for(Produto p : carrinho) {
			System.out.println("nome: " + p.getName());
			System.out.println("preco final: $" + p.calcularPrecoFinal());
		}
		
		sc.close();
	}

}
