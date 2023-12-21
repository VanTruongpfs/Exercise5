package Exercise511;

public class Mail {
	private String from;
	private Date date;
/**
 * this is a constructor of class Mail. There are 2 field
 * @param from
 * @param date
 * example:
 *  new Mail("levantruong@gmail.com",new Date(16, 12, 2023));
 *  new Mail("levantruong123@gmail.com",new Date(17, 12, 2023));
 *  new Mail("levantruong456@gmail.com",new Date(18, 11, 2023));
 *  new Mail("levantruong789@gmail.com",new Date(19, 12, 2023));
 */
	public Mail(String from, Date date) {
		this.from = from;
		this.date = date;
		
	}
@Override
public String toString() {
	return "Mail" +"\nfrom: " + from + ", date: " + date + "\n\n";
}
public boolean early(Mail that) {
	return this.date.early(that.date);
}
}
