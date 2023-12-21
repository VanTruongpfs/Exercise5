package Exercise511;

public class Date {
	private int day;
	private int month;
	private int year;

	/**
	 * this is a constructor of class Date. There are 3 field
	 * 
	 * @param day
	 * @param month
	 * @param year  example: new Date(16, 12, 2023); new Date(17, 12, 2023); new
	 *              Date(18, 12, 2023); new Date(19, 12, 2023);
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}

	public boolean early(Date that) {
		if ((this.year == that.year)) {
			if (this.month == that.month) {
				return this.day < that.day;
			}
			return this.month < that.month;
		}
		return this.year < that.year;
	}
}
