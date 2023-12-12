package Exercise55;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;
/**
 * this is a constructor of class Entry. There are 4 field
 * @param date
 * @param distance
 * @param duration
 * @param comment
 * example:
 * 	new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
*	new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
*	new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
 */
	public Entry(Date date, double distance, int duration, String comment) {
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
	public String toString() {
		double v = duration / distance;
		return "\nDate: " + date + "\ndistance: " + distance + "\nduration: " + duration + "\ncomment: " + comment +"\nMinute Per Mile: " +v+ "\n";
}
/**
 * this is method getMonth()
 * @return
 */
	public int getMonth() {
		return this.date.getMonth();
	}
/**
 * this is method getDistance()
 * @return
 */
	public double getDistance() {
		return this.distance;
	}
/**
 * this is method minutePerMile()
 * @return
 */
	public double minutePerMile() {
		return this.distance / this.duration;
	}
/**
 * this is method faster()
 * @param that
 * @return
 */
	public boolean faster(Entry that) {
		return this.minutePerMile()<= that.minutePerMile();
	}

}
