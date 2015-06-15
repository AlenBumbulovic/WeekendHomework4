package ba.bitcamp.WeekendHomework;

public class Player {
	
	public String name;
	public int year;
	public String position;
	
	
	public Player(String name, int year, String position) {
		super();
		this.name = name;
		this.year = year;
		this.position = position;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", year=" + year + ", position="
				+ position + "]";
	}
	
	
	
	

}
