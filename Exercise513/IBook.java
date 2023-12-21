package Exercise513;

public interface IBook {
	public boolean isEmty();
	public String toString();
	public IBook thisAuthor(String author);
	public IBook insert(Book other);
	public IBook sortByTitle();
}
