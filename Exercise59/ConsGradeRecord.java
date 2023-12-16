package Exercise59;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsGradeRecord implements IGradeRecord{
	private GradeRecord first;
	private IGradeRecord rest;
/**
 * this is a constructor of class ConsGradeRecord. There are 2 field
 * @param first
 * @param rest
 */
	public ConsGradeRecord(GradeRecord first, IGradeRecord rest) {
		this.first = first;
		this.rest = rest;
	}
/**
 * this is a method isEmty()
 * @return
 */
	public boolean isEmty() {
		return false;
	}
/**
 * this is a method toString()
*/
@Override
	public String toString() {
		return this.first.toString()+this.rest.toString();
		}
/**
 * this is a method howManyCredit()
 * example:
 * 		GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord i2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord i3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord i4 = new GradeRecord(721, "Data Structure", 4, 8.0);
		
		MTGradeRecord mt = new MTGradeRecord();
		ConsGradeRecord l4 = new ConsGradeRecord(i4, mt);
		ConsGradeRecord l3 = new ConsGradeRecord(i3, l4);
		ConsGradeRecord l2 = new ConsGradeRecord(i2, l3);
		ConsGradeRecord l1 = new ConsGradeRecord(i1, l2);
			assertEquals(l1.howManyCredit(), 13);
			assertEquals(l2.howManyCredit(), 10);
			assertEquals(l3.howManyCredit(), 8);
			assertEquals(l1.howManyCredit(),13);
 */
	public int howManyCredit() {
		return this.first.getCredit()+this.rest.howManyCredit();
	}
/**
 * this is method use to computes sum of product
 */
	public double sumProduct() {
		return this.first.sumProduct()+this.rest.sumProduct();
	}
/**
 * this is method computes grade of Average
 * example:
 * GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord i2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord i3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord i4 = new GradeRecord(721, "Data Structure", 4, 8.0);
		
		MTGradeRecord mt = new MTGradeRecord();
		ConsGradeRecord l4 = new ConsGradeRecord(i4, mt);
		ConsGradeRecord l3 = new ConsGradeRecord(i3, l4);
		ConsGradeRecord l2 = new ConsGradeRecord(i2, l3);
		ConsGradeRecord l1 = new ConsGradeRecord(i1, l2);
			assertEquals(l1.gradeAverage(), 7.11, 0.01);
			System.out.println("Grade Average: "+l1.gradeAverage());
 * 
 */
	public double gradeAverage() {
		return this.sumProduct()/this.howManyCredit();
	}
/**
 * this is method sortByGradeDec()
 * example:
 * 		GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord i2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord i3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord i4 = new GradeRecord(721, "Data Structure", 4, 8.0);
		
		MTGradeRecord mt = new MTGradeRecord();
		ConsGradeRecord l4 = new ConsGradeRecord(i4, mt);
		ConsGradeRecord l3 = new ConsGradeRecord(i3, l4);
		ConsGradeRecord l2 = new ConsGradeRecord(i2, l3);
		ConsGradeRecord l1 = new ConsGradeRecord(i1, l2);
		 System.out.println(l1.sortByGradeDec());
 */
	public IGradeRecord sortByGradeDec() {
		return (this.rest.sortByGradeDec()).insert(first);
	}
/**
 * this is method insert()
 */
	public IGradeRecord insert(GradeRecord other) {
		if(other.hasBiggerThan(first)) {
			return new ConsGradeRecord(other, this);
		}else
			return new ConsGradeRecord(this.first, this.rest.insert(other));
	}
/**
 * this is method greaterThanList()
 * example:
 * 		GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord i2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord i3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord i4 = new GradeRecord(721, "Data Structure", 4, 8.0);
		
		MTGradeRecord mt = new MTGradeRecord();
		ConsGradeRecord l4 = new ConsGradeRecord(i4, mt);
		ConsGradeRecord l3 = new ConsGradeRecord(i3, l4);
		ConsGradeRecord l2 = new ConsGradeRecord(i2, l3);
		ConsGradeRecord l1 = new ConsGradeRecord(i1, l2);
		 System.out.println(l1.greaterThanList(6));
 */
	public IGradeRecord greaterThanList(double grade) {
		if(this.first.getGrade()> grade) {
			return new ConsGradeRecord(this.first, this.rest.greaterThanList(grade));
		}else {
			return this.rest.greaterThanList(grade);
		}
	}
}
