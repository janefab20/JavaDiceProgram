package dice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameEvents {

	private int playerTurn;
	private String[] players = new String[4];
	
	public void playerTurns(String playerName){
		playerTurn = (int)(Math.random()*4) + 1;
		if(players[playerTurn].isEmpty()){
			players[playerTurn] = playerName;
		}
		else {
			playerTurn = (int)(Math.random()*4) + 1;
		}
	}
}
