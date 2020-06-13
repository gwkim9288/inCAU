package bookMarketSystem;

import java.util.ArrayList;

import bookMarket.SystemForUser;

public class UserPlace extends Place implements SystemForUser{
	
	Human currentUser;
	BookManager bookManager = new BookManager(false);
	ArrayList<Book> bookSearchList = new ArrayList<>();
	
	public UserPlace(Human cur) {
		super(cur);
	}
		
	public boolean enterBook(String name, String author, String state, Integer price, Integer year) {
		return bookManager.enterBook(name,author,state,price,year,currentUser);
	}

	public boolean deleteBook(Book book) {
		if(book.getUser() == currentUser)
			return bookManager.deleteBook(book);
		else
			return false;
	}
	
	public Purchase buyBook(int num) {
		if(bookSearchList == null)
			return new Purchase(currentUser, null);
		return new Purchase(currentUser,bookSearchList.get(num));
	}
	
	public ArrayList<String> findBook(String bookName) {
		bookSearchList = bookManager.getBookInfo(bookName);
		ArrayList<String> searchResult = new ArrayList<>();
		for(Book i : bookSearchList)
			searchResult.add(i.toString());
		return searchResult;
	}
	
	public boolean modifyBook(Book book,String name, String author, String state, Integer price , Integer year) {
		if(name == null)
			return false;
		bookManager.modifyBookInfo(book, new Book(name,author,state,price,year,currentUser));
		return true;
	}

	


	
	
}
