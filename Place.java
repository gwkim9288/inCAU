package bookMarketSystem;

import java.util.ArrayList;

import bookMarket.SystemForAdmin;
import bookMarket.SystemForUser;

public abstract class Place implements SystemForUser, SystemForAdmin {

	Human currentUser;
	BookManager bookManager = new BookManager();
	
	public Place(Human cur) {
		currentUser = cur;
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean deleteBook() {
		return false;
	}
	
	// throws NumberFormatException to UI. show error message and repeat search process
	public abstract ArrayList<String> findBook (String term, int decision);
	
	public boolean enterBook() {
		return false;
	}
	
	public ArrayList<String> listUp() {
		return null;
	}
	
	public boolean buyBook(String bookName) {
		return false;
	}
	
	public boolean modifyBook(String bookName,String content) {
		return false;
	}
	public ArrayList<String> listUserBook(){
		return null;
	}
}
