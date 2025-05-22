/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/

package c3.StringExerciseprogams;

public class WordCounter {

    // Function to count the number of words in a string
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more whitespace characters
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String text1 = "AIET is a great place to learn";
        String text2 = "   ";
        String text3 = null;

        System.out.println("Text: \"" + text1 + "\" has " + countWords(text1) + " words.");
        System.out.println("Text: \"" + text2 + "\" has " + countWords(text2) + " words.");
        System.out.println("Text: null has " + countWords(text3) + " words.");
    }
}
