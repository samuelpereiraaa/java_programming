package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Chair;
import entities.Cookie;

public class Exercicio05Part2e3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Chair myChair = new Chair("Office Chair", 450.00, 5, "Mesh", "Black");
        Cookie myCookie = new Cookie("Oreo", 5.50, 100, "12/2026", "Nabisco");
		
		
        System.out.println(myChair.toString());
        System.out.println(myCookie.toString());
		
		sc.close();
	}
}
