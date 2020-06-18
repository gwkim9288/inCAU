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
	boolean deleteBook(int bookNum){
		for(Book i : bookList)
		{
			if(i.getNum() == bookNum) {
				bookList.remove(i);
				return true;
			}
		}
		return false;
	}

	//return false if there is no name value, return true is done. 
	boolean enterBook(Book book) {
		bookList.add(book);
		return true;
	}
	
	public ArrayList<Book> getBookInfo(String bookName) {
		ArrayList<Book> result = new ArrayList<>();
		for(Book i : bookList) {
			if(i.getName().equals(bookName))
				result.add(i);
		}
		return result;
	}
	
	public boolean modifyBookInfo(int bookNum, Book newBook) {
		int num =0 ;
		for(Book i : bookList) {
			if(i.getNum() == bookNum) {
				bookList.set(num, newBook);
				return true;
			}
			num++;
		}
		return false;
	}
	
	public Book matchBook(int num) {
		for(Book i : bookList) {
			if(i.getNum() == num)
				return i;
		}
		return null;
	}
}
