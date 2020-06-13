package bookMarketSystem;

import java.util.ArrayList;

public class BookManager {
	
	boolean isAdmin;
	// the book list that entered in book market system.
	private static ArrayList<Book> bookList = new ArrayList<>();
	
	public BookManager(boolean isAdmin) {
		this.isAdmin = isAdmin;
		// TODO Auto-generated constructor stub
	}

	//delete the book in the list. true is done.
	boolean deleteBook(Book book){
		for(Book i : bookList)
		{
			if(i == book) {
				bookList.remove(i);
				return true;
			}
		}
		return false;
	}

	//return false if there is no name value, return true is done. 
	boolean enterBook(String name, String author, String state, Integer price, Integer year, Human user) {
		if(name == null)
			return false;
		bookList.add(new Book(name,author,state,price,year,user));
		return true;
	}
	
	public ArrayList<Book> getBookInfo(String bookName) {
		ArrayList<Book> result = new ArrayList<>();
		for(Book i : bookList) {
			if(i.getName() == bookName)
				result.add(i);
		}
		return result;
	}
	
	public boolean modifyBookInfo(Book book, Book newBook) {
		int num =0 ;
		for(Book i : bookList) {
			if(i == book) {
				bookList.set(num, newBook);
				return true;
			}
			num++;
		}
		return false;
	}
}
