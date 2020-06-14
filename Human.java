package bookMarketSystem;

import java.util.ArrayList;

public abstract class Human {
	private String name;
	private String password;
	protected boolean activation = true;
	
	
	public Human(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	//check current user is administrator
	boolean isAdmin(){
		if (this.name == "admin")
			return true;
		else
			return false;
	}
	
	// user login, used by UserManageer
	boolean matchInfo(String name, String password){
		if(this.name == name&&this.password == password)
			return true;
		else
			return false;
	}
	
	//return this user's name
	String getName() {
		return this.name;
	}
	
	abstract void addBook(Book book);
	
	abstract boolean changeActive();
	
	abstract boolean getActivation();

	abstract ArrayList<String> listUserBook();

	
}
