package arrays;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Quantas pessoas serao digitadas ? ");
		n = sc.nextInt();
		Person[] array = new Person[n];

		int contador = 1;
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Dados da " + contador + "a pessoa:");

			System.out.println("nome: ");
			String nome = sc.next();

			System.out.println("idade: ");
			sc.nextLine();
			int idade = sc.nextInt();

			System.out.println("altura: ");
			double altura = sc.nextDouble();

			array[i] = new Person(nome, idade, altura);
			
			contador++;
		}

		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i].getAltura();
		}
		System.out.println();
		
		double media = sum / array.length;

		System.out.printf("ALTURA MEDIA: %.2f%n", media);
		

		int contadorMenores = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].getIdade() < 16) {
				contadorMenores++;
			}
		}

		// (double) para converter o proximo dado em double
		double porcetagem = (double) contadorMenores * (100 / n);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%n", porcetagem);

		for (int i = 0; i < array.length; i++) {
			if (array[i].getIdade() < 16) {
				System.out.println(array[i].getNome());
			}
		}
		sc.close();
	}
}
