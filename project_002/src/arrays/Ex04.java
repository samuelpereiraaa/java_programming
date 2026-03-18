package arrays;

import java.util.Locale;
import java.util.Scanner;



public class Ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		System.out.println("QUANTOS NUMEROS VOCE VAI DIGITAR? ");
		n = sc.nextInt();
		
		double[] array = new double[n];
		
		for(int i = 0; i<array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i]= sc.nextDouble();
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.println("VALORES INSERIDOS: " + array[i]);
		}
		
		/* usando API STREAM para exibir os valores
		Arrays.stream(array).forEach(System.out::println);
		*/
		
		double sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.printf("SOMA DOS VALORES: %.2f%n", sum);
		
		double average = sum / array.length;
		System.out.printf("MEDIA: %.2f%n", average);
		
		
		sc.close();
	}
}
