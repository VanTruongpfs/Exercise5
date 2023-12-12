package Exercise53;

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

}
