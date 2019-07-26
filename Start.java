import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Set;
/**
 * Here is where is going to run the game. There is only 3 methods for you to choose. 
 * 1-) one you set your age and your name.
 * 2-) which mode you are going to play, then you answer the questions.
 * 3-) to put the scores to the file.
 * 
 * @author Douglas Torita Nishimoto 
 * @version 10 May 2016
 */
public class Start
{
    private ArrayList<Game> personList;
    private HashMap<String, Integer> scoreMap;
    private Game gameObject;
    private int anyAge;
    private String anyName;
    private FileWriter scoreObject;
    private String fileName;

    /**
     * Constructor 
     */
    public Start()
    {
        scoreMap=new HashMap<>();
        gameObject=null;
        fileName="Scores.txt";

    }

    /**
     * here is to put the scores to the file
     */
    public void exportScore(){
        StringBuilder builderObject= new StringBuilder(); 
        builderObject.append("Scores\n");
        Set<String> keys=scoreMap.keySet();
        for(String key: keys){
            builderObject.append("\n"+scoreMap.get(key));
        }


        try{// Step 1-Open the coonection to the file
            scoreObject= new FileWriter(fileName);

            // Step 2- Write the data
            scoreObject.write(builderObject.toString());

            // Step 3-Close  connection 
            scoreObject.close();}
        catch(IOException ioException){
            System.out.println("Error processing file.");
        }
    }

    /**
     *  this method is to run the game, which mode you are going to play
     */
    public void run(){
        String mode=JOptionPane.showInputDialog(
                null,"What mode do you want to play? \n(Type 'c' for competitive or anything else for fun mode", "Select Mode", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Name: " + anyName);
        System.out.println("Age: " + anyAge);

        if(mode.equals("c")){
            double anyBet = Double.valueOf(JOptionPane.showInputDialog(
                        null,"How much are you going to bet?", "Bet", JOptionPane.PLAIN_MESSAGE));
            gameObject= new Competitive(anyAge, anyName, anyBet);
            System.out.println("Your bet: " +anyBet);
        }

        else {

            gameObject= new ForFun(anyAge, anyName);

        }
        gameObject.run();

        if(scoreMap.containsKey(anyName)){
            Integer score=scoreMap.get(anyName);
            if(score<gameObject.getScore()){
                scoreMap.put(anyName, gameObject.getScore());
            }
        }
        else{
            scoreMap.put(anyName, gameObject.getScore());
        }
        System.out.println("Your score is: " + gameObject.getScore());
        System.out.println("Your highest score is: " + scoreMap.get(anyName));
        System.out.println(" ");
    }
    
    /**
     * This method is to set your name and your age
     */

    public void newPlayer(){
        anyName=JOptionPane.showInputDialog(
            null,"What is your name?", "Name", JOptionPane.PLAIN_MESSAGE);
        anyAge = Integer.valueOf(JOptionPane.showInputDialog(
                null,"How old are you?", "Age", JOptionPane.PLAIN_MESSAGE));
        
    }
}
