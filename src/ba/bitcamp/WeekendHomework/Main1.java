package ba.bitcamp.WeekendHomework;

public class Main1 {
	/**
	 * this method counts how many bestseller books has an author
	 * @param a an author
	 * @return returns the number of bestseller books of an author
	 */
	public static int countBestsellingBooks(Author a){
		int counter = 0;
		for(int i = 0; i < a.book.length; i++){
			if(a.book[i].isBestseller){
				counter ++;
			}
		}return counter;
		
	}
	/**
	 * A method that returns the number of books an author has written 
	 * durnig a certein period
	 * @param a an author
	 * @param year1 the start of a certein period
	 * @param year2 the end of the period
	 * @return the number of books written in a certein period
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2){
		int counter = 0;
		for(int i = 0; i < a.book.length; i++){
			if(a.book[i].year <= year2 && a.book[i].year >= year1){
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		
		
		Book b = new Book("Crime and Punishment", 1866, "Novel", false);
		Book b1 = new Book("The gambler", 1867, "Novella", false);
		Book[] books = new Book[]{b, b1};
		Author a1 = new Author("Fyodor Dostoyevsky", 1821, books);
		
		Book b2 = new Book("Don Quixote", 1605, "Burlesque", true);
		Book b3 = new Book("La Galatea", 1585, "Novel", false);
		Book[] books1 = new Book[]{b2, b3};
		Author a2 = new Author("Miguel de Cervantes", 1574, books1);
		
		Book b4 = new Book("The Lord Of The Rings", 1954, "Adventure", true);
		Book b5 = new Book("The Hobbit", 1937, "Adventure", true);
		Book[] books2 = new Book[]{b4,b5};
		Author a3 = new Author("J.R.R. Tolkien", 1892, books2);
		
		
		
		System.out.println("This author has: " +countBestsellingBooks(a2) + " bestseller books");
		System.out.println();
		System.out.println("The author has written " +getNumberOfWrittenBooks(a3, 1920, 1960) 
			+ " books in a certein period"	);
		

	}

}
