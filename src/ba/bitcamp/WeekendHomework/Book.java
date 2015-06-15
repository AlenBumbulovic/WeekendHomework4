package ba.bitcamp.WeekendHomework;

public class Book {
	public String name;
	public int year;
	public String genre;
	public boolean isBestseller;
	public Book(String name, int year, String genre, boolean bestseller) {
		super();
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.isBestseller = bestseller;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", year=" + year + ", genre=" + genre
				+ ", bestseller=" + isBestseller + "]";
	}
	
	

}
