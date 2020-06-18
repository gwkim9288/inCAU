package bookMarketSystem;

import java.util.ArrayList;

public class Admin extends Human {

	Admin() {
		super("admin", "sssss");
	}

	@Override
	boolean changeActive() {
		return false;
	}

	@Override
	boolean getActivation() {
		return true;
	}

	@Override
	ArrayList<String> listUserBook() {
		return null;
	}


	@Override
	void addBook(Book book) {
		
	}

	@Override
	String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

}
