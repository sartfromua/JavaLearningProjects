import java.util.ArrayList;
import java.util.Scanner;

public class Question implements QuestionInterface{
    String question;
    ArrayList<String> options = new ArrayList<String>();
    String rightAnswer;

    public Scanner scan = new Scanner(System.in);

    @Override
    public String askQuestion() {
        System.out.println(question);
        int i=1;
        for (String option: options) {
            System.out.println(i++ + ". " + option);
        }
        System.out.print("Number of your answer: ");
        int answer = getAnswer();
        return Integer.toString(answer);
    }

    private int getAnswer() {
        boolean flag = true;
        String answer = "";
        while (flag) {
            answer = scan.next();
            for (int i = 1; i < options.size() + 1; i++) {
                if (Integer.toString(i).equals(answer)) {
                    flag = false;
                    break;
                }
            }
        }
        return Integer.parseInt(answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals(Integer.toString(options.indexOf(rightAnswer)+1));
    }

    @Override
    public String getRightAnswer() {
        return rightAnswer;
    }

    @Override
    public ArrayList<String> getOptions() {
        return new ArrayList<String>(options);
    }

    @Override
    public boolean inputFromConsole() {
        System.out.println("Enter question in one line:");
        question = scan.nextLine();
        System.out.println("Number of options: ");
        int n = scan.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Enter option #" + i + " in one line: ");
            options.add(scan.nextLine());
        }
        return true;
    }

    @Override
    public boolean inputFromFile(String filename) {
        return false;
    }
}
