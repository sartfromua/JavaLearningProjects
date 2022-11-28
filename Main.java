public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.getQuestionsFromCSVFile("List_of_questions.csv");
        quiz.playQuiz();
    }
}
