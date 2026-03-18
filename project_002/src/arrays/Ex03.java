package arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		int[] array = new int[n];

		if (n <= 10) {
			for (int i = 0; i < array.length; i++) {
				System.out.print("digite um numero: ");
				array[i] = sc.nextInt();
			}
		} else {
			System.out.println("SO ACEITAMOS ATE 10 NUMEROS!");
		}

		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				System.out.printf("%d%n", array[i]);
			}
		}
		/* metodo .filter. da API STREAM
		Arrays.stream(array) 
		.filter(num -> num < 0)
		.forEach(System.out::println);
		*/
		sc.close();
	}

}
