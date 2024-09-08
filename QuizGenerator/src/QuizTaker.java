import java.util.Scanner;

public class QuizTaker {
    private Scanner scanner;

    public QuizTaker() {
        scanner = new Scanner(System.in);
    }

    public void takeQuiz(Quiz quiz) {
        int score = 0;

        for (Question question : quiz.getQuestions()) {
            System.out.println(question.getQuestionText());

            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((char) ('A' + i) + ": " + options[i]);
            }

            System.out.println("Enter your answer (A/B/C/D):");
            char answer = scanner.nextLine().toUpperCase().charAt(0);

            if (answer == question.getCorrectAnswer()) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer was " + question.getCorrectAnswer());
            }
        }

        System.out.println("You scored " + score + " out of " + quiz.getQuestions().size());
    }
}
