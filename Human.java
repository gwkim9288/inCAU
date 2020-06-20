package bookMarketSystem;

import java.util.ArrayList;

public abstract class Human {
	protected String name;
	protected String password;
	protected boolean activation = true;
	
	
	public Human(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	//check current user is administrator
	boolean isAdmin(){
		if (this.name.equals("admin"))
			return true;
		else
			return false;
	}
	
	// user login, used by UserManageer
	public boolean matchInfo(String name, String password){
		if(this.name.equals(name)&&this.password.equals(password))
			return true;
		else
			return false;
	}
	
	//return this user's name
	public String getName() {
		return this.name;
	}
	
	abstract void addBook(Book book);
	
	abstract boolean changeActive();
	
	abstract boolean getActivation();

	abstract ArrayList<String> listUserBook();

	abstract public String getAddress();

	abstract public void modifyBookInfo(int bookNum, Book book);
	
	abstract public boolean deleteBook(int bookNum);
	
}
