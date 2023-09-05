import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckboxQuestion extends Question{
    private List<String> choices;
    private List<Integer> correctChoices;

    public CheckboxQuestion(String text, List<String> choices, List<Integer> correctChoices) {
        super(text);
        this.choices = choices;
        this.correctChoices = correctChoices;
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
        List<Integer> selectedChoices = getSelectedChoices();
        return selectedChoices.containsAll(correctChoices) && correctChoices.containsAll(selectedChoices);
    }

    private List<Integer> getSelectedChoices() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> selectedChoices = new ArrayList<>();
        System.out.println("Select multiple choices (enter -1 to finish):");
        int choice;
        while ((choice = scanner.nextInt()) != -1) {
            selectedChoices.add(choice);
        }
        return selectedChoices;
    }
}
