import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TrueFalseQuestion extends Question{
    private boolean correctAnswer;

    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getText());
        System.out.println("1. True");
        System.out.println("2. False");
    }

    @Override
    public boolean isAnswerCorrect() {
        return correctAnswer == getSelectedAnswer();
    }

    private boolean getSelectedAnswer() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice == 1;
    }
}
