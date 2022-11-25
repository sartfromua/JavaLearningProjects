import java.util.ArrayList;

public interface QuestionInterface {
    String askQuestion();
    boolean checkAnswer(String answer);
    String getRightAnswer();
    ArrayList<String> getOptions();
    boolean inputFromConsole();
    boolean inputFromFile(String filename);
}
