package bookMarketSystem;

public class Book {
	
	private String name;
	private Integer ISBN;
	private String publisher;
	private String author;
	private Integer state; //1 = Excellent, 2 = Good, 3 = Fair
	private Integer price;
	private Integer year;
	private Human user;
	private int uniqueNum;
	private static int totalNum=1;
	
	public Book(String name, Integer ISBN, String author,String publisher, Integer state, Integer price, Integer year,Human user ) {
		this.name = name;
		if(ISBN < 0)
			this.ISBN = null;
		else
			this.ISBN=ISBN;
		this.author = author;
		this.publisher = publisher;
		this.state = state;
		if(price<0)
			this.price = null;
		else
			this.price = price;
		if(year<0)
			this.year = null;
		else
			this.year = year;
		this.user = user;
		this.uniqueNum = totalNum;
		totalNum++;
	}
	
	public Human getUser() {
		return this.user;
	}
	
	public String getName() {
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
	public int getNum() {
		return this.uniqueNum;
	}
	
	public String toString() {
		String st;
		switch(this.state)
		{
		case 1:
			st = "Excellent";
			break;
		case 2:
			st = "Good";
			break;
		case 3:
			st = "Fair";
			break;
		default:
			st ="null";	
		}
		if(author.isEmpty())
			author =null;
		if(publisher.isEmpty())
			publisher = null;
		return String.format("Num:%d\tName:%s\tISBN:%d\tAuthor:%s\tPublisher:%s\tPublishing Year:%d\tPrice:%d\tState:%s", uniqueNum,name,ISBN,author,publisher,year,price,st);
	}
}
