package bookMarketSystem;

public class Book {
	
	private String name;
	private int ISBN;
	private String publisher;
	private String author;
	private String state;
	private Integer price;
	private Integer year;
	private Human user;
	private int uniqueNum;
	private static int totalNum=0;
	
	public Book(String name, int ISBN, String author,String publishser, String state, Integer price, Integer year,Human user ) {
		this.name = name;
		this.ISBN = ISBN;
		this.author = author;
		this.publisher = publisher;
		this.state = state;
		this.price = price;
		this.year = year;
		this.user = user;
	}
	
	Human getUser() {
		return this.user;
	}
	
	String getName() {
		return this.name;
	}
}
