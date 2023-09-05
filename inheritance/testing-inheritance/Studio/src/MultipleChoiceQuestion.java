import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question{
    private List<String> choices;
    private int correctChoice;

    public MultipleChoiceQuestion(String text, List<String> choices, int correctChoice) {
        super(text);
        this.choices = choices;
        this.correctChoice = correctChoice;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getText());
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
    }

    @Override
    public boolean isAnswerCorrect() {
        return correctChoice == getSelectedChoice();
    }

    private int getSelectedChoice() {
        // Simulate user input for choice selection
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
