package bookMarketSystem;

import java.util.ArrayList;

import bookMarket.SystemForUser;

public class UserPlace extends Place implements SystemForUser{
	
	Human currentUser;
	BookManager bookManager = new BookManager(false);
	ArrayList<Book> bookSearchList = new ArrayList<>();
	
	public UserPlace(Human cur) {
		super(cur);
		currentUser = cur;
	}
		
	public boolean enterBook(String name, Integer ISBN, String author, String publisher,String state, Integer price, Integer year) {
		Book book = new Book(name,ISBN,author,publisher,state,price,year,currentUser);
		currentUser.addBook(book);
		return bookManager.enterBook(book);
	}

	public boolean deleteBook(int bookNum) {
		if(bookManager.matchBook(bookNum).equals(currentUser))
			return bookManager.deleteBook(bookNum);
		else
			return false;
	}
	
	public String buyBook(int num) {
		Purchase pur = new Purchase(currentUser,num);
		return pur.doPurchase();
	}
	
	public ArrayList<String> findBook(String bookName) {
		bookSearchList = bookManager.getBookInfo(bookName);
		ArrayList<String> searchResult = new ArrayList<>();
		for(Book i : bookSearchList)
			searchResult.add(i.toString());
		return searchResult;
	}
	
	public boolean modifyBook(int bookNum,String name,Integer ISBN, String author,String publisher, String state, Integer price , Integer year) {
		if(bookManager.matchBook(bookNum).getUser() == currentUser)
			return 	bookManager.modifyBookInfo(bookNum, new Book(name,ISBN,author,publisher,state,price,year,currentUser));
		else
			return false;
	}

	public ArrayList<String> listUserBook(){
		return currentUser.listUserBook();
	}



}
