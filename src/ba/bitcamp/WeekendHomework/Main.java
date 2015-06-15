package ba.bitcamp.WeekendHomework;

public class Main {
	/**
	 * Returns the number of players that are born in a given year
	 * @param t the team players
	 * @param year the given year
	 * @return number of players born in a given year
	 */
	public static int countPlayerAge(Team t, int year){
		int counter = 0;
		for(int i = 0; i < t.player.length; i++){
			if(t.player[i].year == year){
				counter ++;
			}
			
		}return counter;
	}
	/**
	 * returns the number of players that are playing in a certain position
	 * @param t team
	 * @param position the given position
	 * @return number of players playing in the given position
	 */
	public static int countPlayerPosition(Team t, String position ){
		int counter = 0;
		for(int i = 0; i < t.player.length; i++){
			if(t.player[i].position == position){
				counter++;
			}
		}return counter;
		
	}
	/**
	 * a method that tells us who is the youngest player of the team
	 * @param t the team
	 * @return the youngest player
	 */
	public static Player getYoungestPlayer(Team t){
		Player youngestPlayer = t.player[0];
		for(int i = 0; i < t.player.length; i++){
			if(youngestPlayer.year < t.player[i].year){
				youngestPlayer = t.player[i];
			}
		}return youngestPlayer;
		
	}

	public static void main(String[] args) {
		
		Player[] p = new Player[11];
		 p[0] = new Player("Morata", 1992, "Forward");
		 p[1] = new Player("Vidal", 1987, "Midfielder");
		 p[2] = new Player("Buffon", 1973, "Goalkeeper");
		 p[3] = new Player("Pogba", 1993, "Midfielder");
		 p[4] = new Player("Chiellini", 1984, "Defender");		 
		 p[5] = new Player("Bonucci", 1987, "Defender");
		 p[6] = new Player("Marchisio", 1986, "Midfielder");
		 p[7] = new Player("Evra", 1981, "Defender");
		 p[8] = new Player("Pirlo", 1979, "Midfielder");
		 p[9] = new Player("Lichtsteiner", 1984, "Defender");
		 p[10] = new Player("Tevez", 1984, "Forward");
		 
		 Team t = new Team("Juventus ", p);
		 
		 System.out.println("The number of players born in a given age is: "
				 + countPlayerAge(t, 1987));
		 System.out.println();
		 System.out.println("The number of players playing in a given position is: " 
				 + countPlayerPosition(t, "Defender"));
		 System.out.println();
		 System.out.println("The youngest player in the team is: " 
		 + getYoungestPlayer(t));
	}

}
