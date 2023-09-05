import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        int score = 0;
        for (Question question : questions) {
            question.displayQuestion();
            boolean isCorrect = question.isAnswerCorrect();
            question.setCorrect(isCorrect);
            if (isCorrect) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect.\n");
            }
        }
        System.out.println("Let's see how ya did, wastelander... Your score: " + score + "/" + questions.size());
    }
}
