package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Dog;

public class Exercicio01Part2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Dog firstDog, secondDog;
		firstDog = new Dog();
		secondDog = new Dog();
		
		
		System.out.println("Enter the informations of first dog:");

		System.out.println("name: ");
		firstDog.name = sc.nextLine();

		System.out.println("age: ");
		firstDog.age = sc.nextInt();
		
		System.out.println("Enter the birth date: dd/MM/yyyy ");
		String dateText = sc.next();
		firstDog.dateBirth = LocalDate.parse(dateText, fmt);

		System.out.println("weight: ");
		firstDog.weight = sc.nextDouble();

		System.out.println("Is vaccineted? (true/false)");
		firstDog.isVaccineted = sc.nextBoolean();
		sc.nextLine();

		
		System.out.println("Enter the informations of second dog:");

		System.out.println("name: ");
		secondDog.name = sc.nextLine();

		System.out.println("age: ");
		secondDog.age = sc.nextInt();
		
		System.out.println("Enter the birth date: dd/MM/yyyy ");
		String dateText2 = sc.next();
		secondDog.dateBirth = LocalDate.parse(dateText2, fmt);

		System.out.println("weight: ");
		secondDog.weight = sc.nextDouble();

		System.out.println("Is vaccineted? (true/false)");
		secondDog.isVaccineted = sc.nextBoolean();
		sc.nextLine();
		
		firstDog.registerBreed(sc);
		System.out.println();
		secondDog.registerBreed(sc);
		
		firstDog.vaccineStatus();
		System.out.println();
		secondDog.vaccineStatus();

		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
