package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Question04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Enther your name: ");
		student.setName(sc.nextLine());

		System.out.print("Enther your first note: ");
		student.setNote1(sc.nextDouble());

		System.out.print("Enther your seccond note: ");
		student.setNote2(sc.nextDouble());

		System.out.print("Enther your third note: ");
		student.setNote3(sc.nextDouble());
		System.out.println();

		System.out.println(student);

		if (student.validateNote().equals("FAILED")) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingNotes());
		} else {
			System.out.println("PASS");
		}

		sc.close();
	}
}
