
/**
 * Child class of the Game Class, this is a competitive class where u have to bet money to answer the questions.
 * 
 * @author Douglas Torita Nishimoto 
 * @version 10 May 2016
 */
public class Competitive extends Game
{
    private double bet;

    /**
     * Competitive
     */
    public Competitive(int anyAge, String anyName, double anyBet)
    {
        super(anyAge, anyName);
        setBet(anyBet);
        
    }

    /**
     * set the bet
     */
    public void setBet(double anyBet)
    {
        bet=anyBet;
    }
    
    /**
     * return the bet
     */
    public double getBet(){
        return bet;
    }
    
    /**
     * toString
     */
    public String toString(){
        return toStringInfo() + "\nAmount of money bet: " + bet;
    }
    
    /**
     * when end the game
     */
    public void endGame(){
        System.out.println("End of competitive game");
    }
    
    
    
}
