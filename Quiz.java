import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<Question>();
    HashMap<String, Integer> scoreboard = new HashMap<String, Integer>();

    public Scanner scan = new Scanner(System.in);

    public boolean getQuestionsFromFile(String filename){
        try {
            FileReader fr = new FileReader(filename);
            Scanner file = new Scanner(fr);

            String line;
            Question question = new Question();
            while (file.hasNext()) {
                line = file.nextLine();
                if (question.question == null) {
                    question.question = line;
                } else if (!line.equals("")) {
                    if (line.startsWith("!")) {
                        question.rightAnswer = line;
                        question.options.add(line);
                    }
                    else question.options.add(line);
                } else {
                    questions.add(question);
                    question = new Question();
                }
            }
            questions.add(question);
            fr.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return true;
    }

    private ArrayList<String> encrypt(ArrayList<String> key) {
        return key;
    }

    private ArrayList<String> decrypt(ArrayList<String> encryption) {
        return encryption;
    }

    public ArrayList<String> askQuestions() {
        ArrayList<String> key = new ArrayList<String>();
        int i = 0;
        for (Question quest: questions) {
            key.add(quest.askQuestion());
        }
        return encrypt(key);
    }

    public int score(ArrayList<String> answers) {
        int score = 0;
        for (int i=0; i<questions.size(); i++) {
            if (questions.get(i).checkAnswer(answers.get(i))) score += 1;
        }
        return score;
    }

    private void play() {
        System.out.print("\nEnter your name: ");
        String player = scan.next();
        int score = score(decrypt(askQuestions()));
        scoreboard.put(player, score);
    }

    public void showScoreBoard() {
        for (String player: scoreboard.keySet()) {
            System.out.println(player + " - " + scoreboard.get(player));
        }
    }

    public void playQuiz() {
        String command = "help";
        while (!command.toLowerCase().equals("quit")) {
            command = "help";
            System.out.println("""
                      Choose command:\s
                    Enter "Play" to start game
                    Enter "Scoreboard" to see scoreboard
                    Enter "Quit" to end the game""");
            while (!"play scoreboard quit".contains(command.toLowerCase())) {
                command = scan.next();
            }

            if (command.toLowerCase().equals("play")) {
                play();
            }

            if (command.toLowerCase().equals("scoreboard")) {
                showScoreBoard();
            }

        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.getQuestionsFromFile("src\\TestQuestions.txt");
        quiz.playQuiz();
    }
}
