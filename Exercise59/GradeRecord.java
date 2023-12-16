package Exercise59;

public class GradeRecord {
	private int number;
	private String title;
	private int credits;
	private double grade;
/**
 * this is a constructor of class GradeRecord. There are 4 field
 * @param number
 * @param title
 * @param credits
 * @param grade
 * example:
 * 	new GradeRecord(211, "Database Fundamentals", 3, 7.5);
 * 	new GradeRecord(220, "Basic Programming", 2, 5.0);
 * 	new GradeRecord(690, "Algorithms", 4, 7.0);
 * 	new GradeRecord(721, "Data Structure", 4, 8.0);
 */
	public GradeRecord(int number, String title, int credits, double grade) {
		this.number = number;
		this.title = title;
		this.credits = credits;
		this.grade = grade;
	}
/**
 * this is a method toString
 */
@Override
	public String toString() {
		return "\nnumber: " + number + "\ntitle: " + title + "\ncredits: " + credits + "\ngrade: " + grade+"\n";
}
	public int getCredit() {
		return this.credits;
	}
	public double sumProduct() {
		return this.grade*this.credits;
	}
	public boolean hasBiggerThan(GradeRecord that) {
		return this.grade >= that.grade;
	}
	public double getGrade() {
		return this.grade;
	}
}
