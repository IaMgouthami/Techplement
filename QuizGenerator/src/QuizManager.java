import java.util.Scanner;

public class QuizManager {
    private Quiz quiz;
    private Scanner scanner;

    public QuizManager() {
        quiz = new Quiz();
        scanner = new Scanner(System.in);
    }

    public void createQuiz() {
        System.out.println("Enter the number of questions:");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Enter question " + (i + 1) + ":");
            String questionText = scanner.nextLine();

            String[] options = new String[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter option " + (char)('A' + j) + ":");
                options[j] = scanner.nextLine();
            }

            System.out.println("Enter correct answer (A/B/C/D):");
            char correctAnswer = scanner.nextLine().toUpperCase().charAt(0);

            Question question = new Question(questionText, options, correctAnswer);
            quiz.addQuestion(question);
        }
    }

    public Quiz getQuiz() {
        return quiz;
    }
}
