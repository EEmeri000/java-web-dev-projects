import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Question {
    private String text;
    private boolean isCorrect;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract void displayQuestion();

    public abstract boolean isAnswerCorrect();

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
