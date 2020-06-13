package bookMarketSystem;

public class Purchase {

	Book book;
	Human user;
	
	public Purchase(Human currentUser, Book book) {
		this.book = book;
		this.user = currentUser;
		// TODO Auto-generated constructor stub
	}
	
	public String doPurchase() {
		if(book == null)
			return "There is no book";
		return String.format("send e-mail to %s",user.getName());
	}

}
