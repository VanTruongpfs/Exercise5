package Exercise59;

public class MTGradeRecord implements IGradeRecord{
/**
 * this is a method isEmty()
 * @return
 */
	public boolean isEmty() {
		return true;
	}
/**
 * this is a method toString()
 */
	@Override
	public String toString() {
		return "\nMTGradeRecord []";
}
	public int howManyCredit() {
		return 0;
	}
	public double sumProduct() {
		return 0;
	}
	public double gradeAverage() {
		return 0;
	}
	public IGradeRecord insert(GradeRecord other) {
		return new ConsGradeRecord(other, new MTGradeRecord());
	}
	public IGradeRecord sortByGradeDec() {
		return new MTGradeRecord();
	}
	public MTGradeRecord greaterThanList(double grade) {
		return new MTGradeRecord();
	}
}
