package Exercise59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScoreBoardTest {
/**
 * this is testing for list score board
 */
	@Test
	void testScoreBoard() {
		GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord i2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord i3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord i4 = new GradeRecord(721, "Data Structure", 4, 8.0);
		
		 MTGradeRecord mt = new MTGradeRecord();
		 ConsGradeRecord l4 = new ConsGradeRecord(i4, mt);
		 ConsGradeRecord l3 = new ConsGradeRecord(i3, l4);
		 ConsGradeRecord l2 = new ConsGradeRecord(i2, l3);
		 ConsGradeRecord l1 = new ConsGradeRecord(i1, l2);
		
		 ScoreBoard s1 = new ScoreBoard("Tran Thi Hoa", "LTCB", l1);
		 System.out.println(s1);
	}
/**
 * this is testing for method howManyCredit()
 */
	@Test
	void testHowManyCredit() {
		GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
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
		 System.out.println("total credit: " +l1.howManyCredit());
	}
/**
 * this is testing for method gradeAverage()
 */
	@Test
	void testGradeAverage() {
		GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
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
}
/**
 * this is testing for method sortBYGradeDec()
 */
	@Test
	void testSortByGradeDec() {
		GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord i2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord i3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord i4 = new GradeRecord(721, "Data Structure", 4, 8.0);
		
		MTGradeRecord mt = new MTGradeRecord();
		ConsGradeRecord l4 = new ConsGradeRecord(i4, mt);
		ConsGradeRecord l3 = new ConsGradeRecord(i3, l4);
		ConsGradeRecord l2 = new ConsGradeRecord(i2, l3);
		ConsGradeRecord l1 = new ConsGradeRecord(i1, l2);
		 System.out.println(l1.sortByGradeDec());
	}
/**
 * this is testing for method greaterThanList()
 */
	@Test
	void testGreaterThanList() {
		GradeRecord i1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord i2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord i3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord i4 = new GradeRecord(721, "Data Structure", 4, 8.0);
		
		MTGradeRecord mt = new MTGradeRecord();
		ConsGradeRecord l4 = new ConsGradeRecord(i4, mt);
		ConsGradeRecord l3 = new ConsGradeRecord(i3, l4);
		ConsGradeRecord l2 = new ConsGradeRecord(i2, l3);
		ConsGradeRecord l1 = new ConsGradeRecord(i1, l2);
		 System.out.println(l1.greaterThanList(6));
	}
}
