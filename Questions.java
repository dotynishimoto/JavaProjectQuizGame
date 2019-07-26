
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * Here is basically where start the program. It has 3 Arraylists one for the questions, one for the answers and one for the options(since is going to be a multiplechoice questions).
 * 
 * @author Douglas Torita Nishimoto
 * @version 9 May 2016
 */
public class Questions
{

    
    private ArrayList<String> questionsList;
    private ArrayList<String> answersList;
    private ArrayList<String> optionsList;

    /**
     * Constructor 
     */
    public Questions()
    {
        
        questionsList= new ArrayList<>();
        answersList= new ArrayList<>();
        optionsList= new ArrayList<>();

        setAllQuestion();
        setAllAnswer();
    }

    
    
    /**
     * adding the questions and the options on the Arraylist.
     */
    private void setAllQuestion(){
        questionsList.add("How much is 10*10?");
        optionsList.add("a) 90 \nb) 100 \nc) 80 \nd) 70");

        questionsList.add("Which year started the Second World War II?");
        optionsList.add("a) 1939 \nb) 1925 \nc) 1914 \nd) 1941");

        questionsList.add("Who won more times the World Cup?");
        optionsList.add("a) Germany \nb) Brazil \nc) Italy \nd) Argentina");

        questionsList.add("How many states does exist in USA?");
        optionsList.add("a) 51 \nb) 54 \nc) 53 \nd) 50");

        questionsList.add("How old is Barack Obama");
        optionsList.add("a) 49 \nb) 54 \nc) 59 \nd) 50");
    }

    /**
     * setting all the correct answers.
     */
    private void setAllAnswer(){
        answersList.add("b");
        answersList.add("a");
        answersList.add("b");
        answersList.add("d");
        answersList.add("b");

    }
    
    /**
     * this method is to call all the questions
     */
    public String question(int index){
        String answer=JOptionPane.showInputDialog(
                null,questionsList.get(index) + "\n"+optionsList.get(index)+"\n(Enter a,b,c or d to answer)", "Question "+String.valueOf(index+1), JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(
            null, "Correct Answer: "+answersList.get(index)+" \n Answer from the user: " + answer);

        return answer;
    }
    
    /**
     * to return the answer
     */
    public String getAnswer(int index){
        return answersList.get(index);
    }

    
    
    
    
    public int getNumberOfQuestions(){
        return questionsList.size();
    }

    
    
    
}
