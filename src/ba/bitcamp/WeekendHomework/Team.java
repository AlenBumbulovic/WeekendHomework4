package ba.bitcamp.WeekendHomework;

import java.util.Arrays;

public class Team {
	
	public String name;
	public Player[] player;
	
	
	public Team(String name, Player[] player) {
		
		this.name = name;
		this.player = player;
	}


	@Override
	public String toString() {
		return "Team [name=" + name + ", Player=" + Arrays.toString(player)
				+ "]";
	}
	
	

}
