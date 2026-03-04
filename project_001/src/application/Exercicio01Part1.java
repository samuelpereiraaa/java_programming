package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Exercicio01Part1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Person samuel, jhon;

		samuel = new Person();
		jhon = new Person();

		System.out.println("Enter the informations of first person:");

		System.out.println("name: ");
		samuel.name = sc.nextLine();

		System.out.println("Enter the birth date: dd/MM/yyyy ");
		String dateText = sc.next();
		samuel.dateBirth = LocalDate.parse(dateText, fmt);

		System.out.println("quantity of Children: ");
		samuel.quantityChildren = sc.nextInt();

		System.out.println("salary: ");
		samuel.salary = sc.nextDouble();

		System.out.println("Is working? (true/false)");
		samuel.isWork = sc.nextBoolean();
		sc.nextLine();

		System.out.println("Enter the informations of second person:");

		System.out.println("name: ");
		jhon.name = sc.nextLine();

		System.out.println("Enter the birth date: dd/MM/yyyy ");
		String dateText2 = sc.next();
		jhon.dateBirth = LocalDate.parse(dateText2, fmt);

		System.out.println("quantity of Children: ");
		jhon.quantityChildren = sc.nextInt();

		System.out.println("salary: ");
		jhon.salary = sc.nextDouble();

		System.out.println("Is working? (true/false) ");
		jhon.isWork = sc.nextBoolean();
		
		System.out.println("1 person");
		samuel.greetings();
		samuel.workStatus();
		System.out.println();
		
		System.out.println("2 person");
		jhon.greetings();
		jhon.workStatus();
		System.out.println();

		sc.close();

	}

}
