import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println("Enjoy a short quiz about Fallout trivia!");
        quiz.addQuestion(new MultipleChoiceQuestion("In what year did the Nuclear Apocalypse occur?",
                List.of("2108", "2023", "2077", "2234"), 3));

        quiz.addQuestion(new CheckboxQuestion("What were the two primary factions involved in the conflict over the Hoover Dam during the events of Fallout: New Vegas?",
                List.of("The Legion", "The Unity", "The NCR", "The Children of Atom"), List.of(1, 3)));

        quiz.addQuestion(new TrueFalseQuestion("Does war ever change?", false));

        quiz.runQuiz();
    }
}
