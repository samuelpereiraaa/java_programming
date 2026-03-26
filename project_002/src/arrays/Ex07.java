package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] array = new double[n];

		for(int i = 0; i < array.length; i++) {
			System.out.println("digite um numero: ");
			array[i] = sc.nextDouble();
			}
		
		// maior numero
		double maior = array[0];
		for(int i = 0; i<array.length; i++) {
			if(array[i] > maior) {
				maior = array[i];
			}
		}
		
		System.out.println("MAIOR VALOR: " + maior);
		
		
		// encontrar o indice do maior
		int indiceMaior = 0;
		for(int i = 0; i<array.length; i++) {
			if( array[i] > array[indiceMaior]) {
				indiceMaior = i;
			}
		}
		System.out.println("POSICAO DO MAIOR VALOR: " + indiceMaior);
		
		
		
		sc.close();
	}
}
