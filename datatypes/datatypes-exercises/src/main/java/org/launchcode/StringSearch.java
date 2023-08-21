package org.launchcode;
import java.util.Scanner;
public class StringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceSnippet = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        System.out.println("Enter a term to search for within the First sentence of 'Alice in Wonderland'.");
        String searchTerm = input.nextLine();
        boolean searchResult = aliceSnippet.toLowerCase().contains(searchTerm);
        System.out.println("The result of your search term is:" + searchResult);
        Integer index = aliceSnippet.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = aliceSnippet.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
