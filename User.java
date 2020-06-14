package bookMarketSystem;

import java.util.ArrayList;

public class User extends Human {

	private int phoneNum;
	private String address;
	private ArrayList<Book> bookList = new ArrayList<>();
	
	User(String name, String password, String address, int phoneNum) {
		super(name, password);
		this.phoneNum = phoneNum;
		this.address = address;
		// TODO Auto-generated constructor stub
	}
	
	boolean changeActive() {
		if(super.activation == true)
			activation = false;
		else if (activation == false)
			activation = true;
		
		return true;
	}
	
	boolean getActivation() {
		return activation;
	}
	
}
