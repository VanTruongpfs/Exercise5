package Exercise55;

public interface ILog {
	public boolean isEmty();
	public String toString();
	public double totalDistanceInMonth(int month);
	public double maxDistance();
	public ILog sortByMinutePerMile();
	public ILog compare(Entry other);
}
