package Exercise55;

public class MTLog implements ILog{
	public boolean isEmty() {
		return true;
	}

	public String toString() {
		return "MTLog []";
	}
/**
 * this is method totalDistanceInMonth()
 */
	public double totalDistanceInMonth(int month) {
		return 0;
	}
/**
 * this is method maxDistance()
 */
	public double maxDistance() {
		return 0;
	}
/**
 * this is method sortByMinutePerMile()
 */
	public MTLog sortByMinutePerMile() {
		return new MTLog();
	}
/**
 * this is method compare()
 */
	public ILog compare(Entry other) {
		return new ConsLog(other, new MTLog());
	}
}