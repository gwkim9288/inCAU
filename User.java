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
	
	void addBook(Book book) {
		bookList.add(book);
	}
	
	ArrayList<String> listUserBook() {
		ArrayList<String> list = new ArrayList<>();
		if(bookList.isEmpty())
			return null;
		for(Book i: bookList)
			list.add(i.toString());
		return list;
	}

	String getAddress() {
		return address;
	}

	public void modifyBookInfo(int bookNum, Book newBook) {
		int num =0 ;
		for(Book i : bookList) {
			if(i.getNum() == bookNum) {
				bookList.set(num, newBook);
			}
			num++;
		}
	}
	
	public boolean deleteBook(int bookNum){
		for(Book i : bookList)
		{
			if(i.getNum() == bookNum) {
				bookList.remove(i);
				return true;
			}
		}
		return false;
	}
}
