package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Question02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enther the width and heigth of rectangle: ");
		System.out.print("width: ");
		rectangle.setWidth(sc.nextDouble());
		System.out.print("heigth: ");
		rectangle.setHeigth(sc.nextDouble());
		
		System.out.printf("A3REA: %.2f%n", rectangle.area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());
		
		sc.close();
	}

}
