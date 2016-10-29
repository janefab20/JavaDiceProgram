package dice;

public class Player {

	private String name;
	private int money;
	private String[] properties;
	private boolean move = false;
	private int moveCount;
	
	private int turn;
	
	
	public Player(String name, int startingMoney){
		this.name = name;
		this.money = startingMoney;
	}
	
	public String getPlayerName(){
		return this.name;
	}
	
	public String getPlayerMoney(){
		return Integer.toString(this.money);
	}
	
	public void setTurn(int turn){
		this.turn = turn;
	}
}
