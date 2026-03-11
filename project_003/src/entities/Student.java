package entities;

public class Student {
	private String name;
	private double note1;
	private double note2;
	private double note3;
	public double totalNotes;

	public Student() {

	}

	public Student(String name, double note1, double note2, double note3) {
		super();
		this.name = name;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNote1() {
		return note1;
	}

	public void setNote1(double notice1) {
		this.note1 = notice1;
	}

	public double getNote2() {
		return note2;
	}

	public void setNote2(double notice2) {
		this.note2 = notice2;
	}

	public double getNote3() {
		return note3;
	}

	public void setNote3(double notice3) {
		this.note3 = notice3;
	}

	public double finalGrade() {
		return note1 + note2 + note3;
	}

	public String validateNote() {
		if (finalGrade() >= 60.0) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}

	public double missingNotes() {
		if (finalGrade() < 60) {
			return  60 - finalGrade();
		} else {
			return 0.0;
		}
	}

	@Override
	public String toString() {
		return "finalGrade: " + String.format(" %.2f", finalGrade());
	}

}
