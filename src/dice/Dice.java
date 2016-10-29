package dice;

public class Dice {       
	public int die; 
        
    public int roll() {
    	die = (int)(Math.random()*6) + 1;
        System.out.println("die1: " + die);
		return die;
    }
        
    public String isEqual(int die1, int die2)
    {
        if(die1 == die2){
        return "BONUS CARD!";
        }
		return "";
    }

}
