//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QuizManager quizManager = new QuizManager();
        QuizTaker quizTaker = new QuizTaker();

        quizManager.createQuiz();
        Quiz quiz = quizManager.getQuiz();

        System.out.println("Starting quiz...");
        quizTaker.takeQuiz(quiz);
    }
}
