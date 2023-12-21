package Exercise511;

public class MTMail implements IMail{
	public String toString() {
		return "Emty";
	}

	@Override
	public IMail insert(Mail other) {
		return new ConsMail(other, this);
	}

	@Override
	public MTMail sortByDate() {
		return this;
	}
}
