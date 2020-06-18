package bookMarketSystem;

public class Purchase {

	Book book;
	Human user;
	BookManager ma ;
	
	public Purchase(Human currentUser, int num) {
		ma = new BookManager(currentUser.isAdmin());
		this.book = ma.matchBook(num);
		this.user = currentUser;
		// TODO Auto-generated constructor stub
	}
	
	public String doPurchase() {
		if(book == null)
			return "There is not correct book\n";
		return String.format("Success. Send e-mail to %s\n",user.getAddress());
	}

}
