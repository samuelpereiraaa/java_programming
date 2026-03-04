package entities;
import java.time.LocalDate;
import java.util.Scanner;

public class Dog {
	
	
	public  String name;
	public int age;
	public LocalDate dateBirth;
	public double weight;
	public boolean isVaccineted;
	
	public String breed;

	public void registerBreed (Scanner sc) {
		
		System.out.println("type the breed of dog:  ");
		this.breed = sc.nextLine();
		System.out.printf("The dog named %s is of the following breed: %s", this.name,this.breed);
	}
	
	public void vaccineStatus() {
		if(this.isVaccineted) {
			System.out.printf("The dog name %s is vacined", this.name);
		}else {
			System.out.printf("The dog name %s is not vacined", this.name);
			
		}
	}
}
