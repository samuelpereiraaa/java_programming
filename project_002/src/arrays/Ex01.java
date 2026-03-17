package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// create array
		double[] array = new double[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += array[i];
		}

		double average = sum / n;

		System.out.printf("AVERAGE HEIGTH: %.2f", average);

		sc.close();
	}
}
