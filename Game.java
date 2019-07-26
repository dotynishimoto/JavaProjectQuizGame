
/**
 * This class is the parent class of ForFun and Competitive Class. This is a abstract class.
 * 
 * @author Douglas Torita Nishimoto
 * @version 9 May 2016
 */
public abstract class Game
{
    private int age;
    private String name;
    private Questions questions;
    private int score;
    
    
    

    /**
     * Constructor 
     */
    public Game(int anyAge, String anyName)
    {
        age=anyAge;
        name=anyName; 
        score=0;
        questions= new Questions();
   
    }
    
    /**
     * method to set the age
     */
    public void setAge(int anyAge){
        age=anyAge;
    }
    
    /**
     * method to set the name
     */
    public void setName(String anyName){
        name=anyName;
    }
    
    /**
     * method to return the age
     */
    public int getAge(){
        return age;
    }
    
    /**
     * method to return the name
     */
    public String getName(){
        return name;
    }
    
    /**
     * method to print
     */
    //public void printGameInfo(){
     //   System.out.println(toString());
   // }
    
    /**
     *  toString
     */
    public String toStringInfo(){
        return "Name: " + name + "\nAge: " + age;
    }
    
    
    /**
     * run the program and then count the score of the person.
     */
    public void run(){
        score=0;
        for(int count=0; count<questions.getNumberOfQuestions(); count++){
          String answer=questions.question(count); 
          if(answer.equals(questions.getAnswer(count))){
              score=score+20;
            }
        }  
        endGame();
    }
    
    /**
     * return the score
     */
    public int getScore(){
        return score;
    }
    
    /**
     * abstract method
     */
    public abstract void endGame();
        
    

    
    
    
    
}
