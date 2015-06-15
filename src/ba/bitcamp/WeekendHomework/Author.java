package ba.bitcamp.WeekendHomework;

import java.util.Arrays;

public class Author {
	public String name;
	public int year;
	public Book[] book;
	
	public Author(String name, int year, Book[] book) {
		super();
		this.name = name;
		this.year = year;
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", year=" + year + ", Book="
				+ Arrays.toString(book) + "]";
	}
	
	

}
