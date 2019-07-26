
/**
 * Child class from the class Game, this class is a for fun mode to answer the questions
 * 
 * @author Douglas Torita Nishimoto 
 * @version 10 May 2016
 */
public class ForFun extends Game implements Cancel
{
    

    /**
     * Constructor 
     */
    public ForFun(int anyAge, String anyName)
    {
        super(anyAge, anyName);
        
    }
    
    /**
     * method when end the the game
     */
    public void endGame(){
        System.out.println("End of for fun game");
    }
    
    /**
     * cancel
     */
  public void doCancel(){
      System.out.println("Stop the questions.");
    }
}
