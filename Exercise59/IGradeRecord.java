package Exercise59;

public interface IGradeRecord {
	public boolean isEmty();
	public String toString();
	public int howManyCredit();
	public double sumProduct();
	public double gradeAverage();
	public IGradeRecord insert(GradeRecord other);
	public IGradeRecord sortByGradeDec();
	public IGradeRecord greaterThanList(double grade);
}
