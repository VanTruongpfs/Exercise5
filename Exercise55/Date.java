package Exercise55;

public class Date {
	private int day;
	private int month;
	private int year;
/**
 * this is a constructor of class Date. There are 3 field
 * @param day
 * @param month
 * @param year
 * example:
 *  new Date(29, 11, 2023), 5.3, 27, "good");
*	new Date(30, 11, 2023), 2.8, 24, "tired");
*	new Date(31, 11, 2023);
 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return  day + "/" + month + "/" + year ;
}
/**
 * this is method getMonth()
 * @return
 */
	public int getMonth() {
		return this.month;
	}
}
