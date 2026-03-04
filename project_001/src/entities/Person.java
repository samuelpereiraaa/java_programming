package entities;
import java.time.LocalDate;

public class Person {

	public  String name;
	public LocalDate dateBirth;
	public int quantityChildren;
	public double salary;
	public boolean isWork;
	

	public  void greetings() {
		 System.out.printf("Hi, my name is %s, my date of birth is %tF, I have %d children, and I receive %.2f per month."
				 , this.name, this.dateBirth, this.quantityChildren, this.salary);
	}
	
	public void workStatus() {
		if(this.isWork) {
			System.out.println("I am currently employed.");
		}else {
			System.out.println("I am not  employed.");

		}
	}
}
