package functions;
import java.util.Locale;
import java.util.Scanner;

public class ex_001 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enther the number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int higher = valueMax (x, y, z);
		
		printResult(higher); 
		
		
		sc.close();
	}
	public static int valueMax(int a, int b, int c) {
		int result;
		if(a>b && a>c) {
			result = a;
		}else if(b>a && b>c) {
			result = b;
		}else {
			result = c;
		}
		return result;
	}
	public static void printResult (int higher) {
		System.out.println("The HIGHER NUMBER IS: " + higher);
	}
}
