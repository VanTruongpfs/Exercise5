package Exercise511;

public interface IMail {
	public String toString();
	public IMail insert(Mail other);
	public IMail sortByDate();
}
