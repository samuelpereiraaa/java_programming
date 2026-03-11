package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Question03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.printf("name: ");
		employee.setName(sc.nextLine());
		System.out.printf("grossSalary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.printf("tax: ");
		employee.setTax(sc.nextDouble());

	
		System.out.println(employee);
		
		System.out.println("Wich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println(employee.update());
		
		sc.close();

	}

}
