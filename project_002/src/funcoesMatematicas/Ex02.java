package funcoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int diferenca, A, B, C, D;
		
		System.out.println("digite o valor de A:");
		A = sc.nextInt();
		System.out.println("digite o valor de B:");
		B = sc.nextInt();
		System.out.println("digite o valor de C:");
		C = sc.nextInt();
		System.out.println("digite o valor de D:");
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + diferenca);
			
		sc.close();
	}
}
