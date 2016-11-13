package dice;

public class Player {

	private String name;
	private String[] properties;
	private boolean move = false;
	private int moveCount;
	
	private int turn;
	
	
	public Player(String name, int startingMoney){
		this.name = name;
	}
	
	public String getPlayerName(){
		return this.name;
	}
	
	
	public void setTurn(int turn){
		this.turn = turn;
	}
}
