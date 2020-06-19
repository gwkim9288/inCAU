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
	private static int totalNum=1;
	
	public Book(String name, Integer ISBN, String author,String publisher, String state, Integer price, Integer year,Human user ) {
		this.name = name;
		this.ISBN = ISBN;
		this.author = author;
		this.publisher = publisher;
		this.state = state;
		this.price = price;
		this.year = year;
		this.user = user;
		this.uniqueNum = totalNum;
		totalNum++;
	}
	
	Human getUser() {
		return this.user;
	}
	
	String getName() {
		return this.name;
	}
	
	String getAuthor() {
		return this.author;
	}
	
	Integer getISBN() {
		return this.ISBN;
	}
	
	Integer getYear() {
		return this.year;
	}
	
	String getPublisher() {
		return this.publisher;
	}
	int getNum() {
		return this.uniqueNum;
	}
	
	public String toString() {
		return String.format("Num:%d\tName:%s\tISBN:%d", uniqueNum,name,ISBN);
	}
}
