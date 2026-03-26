package arrays;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar ?");
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite um numero: ");
			array[i] = sc.nextInt();
		}

		int contador = 0;
		System.out.println("NUMEROS PARES");

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.printf("%d ", array[i]);
				contador++;
			}
		}
		System.out.println();

		System.out.println("Quantidade de pares: " + contador);

		sc.close();
	}
}
