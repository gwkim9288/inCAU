package bookMarketSystem;

import java.util.ArrayList;

import bookMarket.SystemForAdmin;

public class AdminPlace extends Place implements SystemForAdmin{

	Human currentUser;
	BookManager bookManager =  new BookManager(true);
	ArrayList<Book> bookSearchList = new ArrayList<>();
	
	public AdminPlace(Human admin) {
		super(admin);
		currentUser = admin;
	}
	
	public boolean deleteBook(int bookNum) {
		return bookManager.deleteBook(bookNum);
	}
	
	public ArrayList<String> findBook(String bookName) {
		bookSearchList = bookManager.getBookInfo(bookName);
		ArrayList<String> searchResult = new ArrayList<>();
		for(Book i : bookSearchList)
			searchResult.add(i.toString());
		return searchResult;
	}

	//override method
	public String buyBook(int num) {
		return null;
	}


	@Override
	public ArrayList<String> listUserBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean enterBook(String name, Integer ISBN, String author, String publisher, String state, Integer price,
			Integer year) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyBook(int bookNum, String name, Integer ISBN, String author, String publisher, String state,
			Integer price, Integer year) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
