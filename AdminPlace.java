package bookMarketSystem;

import java.util.ArrayList;

import bookMarket.SystemForAdmin;

public class AdminPlace extends Place implements SystemForAdmin{

	Human currentUser;
	BookManager bookManager =  new BookManager(true);
	ArrayList<Book> bookSearchList = new ArrayList<>();
	
	public AdminPlace(Human admin) {
		super(admin);
	}
	
	public boolean deleteBook(Book book) {
		return bookManager.deleteBook(book);
	}
	
	public ArrayList<String> findBook(String bookName) {
		bookSearchList = bookManager.getBookInfo(bookName);
		ArrayList<String> searchResult = new ArrayList<>();
		for(Book i : bookSearchList)
			searchResult.add(i.toString());
		return searchResult;
	}
}
