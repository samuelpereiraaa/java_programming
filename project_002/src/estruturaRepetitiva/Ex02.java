package estruturaRepetitiva;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("digite um numero: ");
		n = sc.nextInt();
		
		int fat = 1;
		
		for(int i=1; i<=n; i++) {
			fat *= i;
		}	
		
		System.out.println("fatorial de " + n +  " e " + fat);
		
		sc.close();
	}
	
	
}
