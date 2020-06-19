package bookMarketSystem;

public class Purchase {

	Book book;
	Human buyer;
	Human seller;
	BookManager ma ;
	
	public Purchase(Human currentUser, int num) {
		ma = new BookManager();
		this.book = ma.matchBook(num);
		this.seller = book.getUser();
		this.buyer = currentUser;
		// TODO Auto-generated constructor stub
	}
	
	public String doPurchase() {
		if(book == null)
			return "There is not correct book\n";
		else if(seller == buyer)
			return "You can't buy your book yourself.\n";
		ma.deleteBook(book.getNum());
		return String.format("Success. Send e-mail to '%s'\n",seller.getAddress());
	}

}
