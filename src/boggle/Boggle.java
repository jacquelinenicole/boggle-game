package boggle;
import core.Board;
import inputOutput.ReadDataFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import userInterface.BoggleUi;


public class Boggle {
    //declaring variables
    public static ArrayList<String> diceData = new ArrayList<>();
    private static final String BOGGLE_FILE_NAME = "../data/BoggleData.txt";
    
    private final ArrayList<String> dictionaryData = new ArrayList<>();
    private static final String DICTIONARY_FILE_NAME = "../data/Dictionary.txt";
    
    public static void main(String[] args) {
        System.out.println("Welcome to Boggle!"); //prints to console
        JOptionPane.showMessageDialog(null, "Let's Play Boggle!"); //popup
        
        //reads dices' data
        ReadDataFile dice = new ReadDataFile(BOGGLE_FILE_NAME);
        dice.populateData();
        
        //reads dictionary's data
        ReadDataFile dictionary = new ReadDataFile(DICTIONARY_FILE_NAME);
        dictionary.populateData();
        
        //instantiates and populates the board's data
        Board board = new Board(dice.getData(), dictionary.getData());
        board.populateDice();
        
        System.out.println("There are " + dictionary.getData().size() + " entries in the dictionary."); //prints number of words to console
        
        diceData = board.shakeDice(); //assigns randomly picked letters on the randomly picked dice to diceData
        
        board.displayBoard(); //shows how the boggle board looks when all dice and sides of dice are randomized
        
        BoggleUi boggleUi = new BoggleUi(board, dictionary.getData());
    }
}