package bookMarketSystem;

import java.util.ArrayList;

import bookMarket.SystemForAdmin;
import bookMarket.SystemForUser;

public abstract class Place implements SystemForUser, SystemForAdmin {

	Human currentUser;
	
	public Place(Human cur) {
		currentUser = cur;
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean deleteBook() {
		return false;
	}
	
	public ArrayList<String> findBook(String name){
		return null;
	}
	
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
