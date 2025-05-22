/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/




package b3.StringPrograms;

public class WhitespaceRemover {

    // Function to remove all whitespace characters from the input string
    public static String removeWhitespace(String input) {
        if (input == null) {
            return null;
        }
        // Replace all whitespace (spaces, tabs, newlines, etc.) with empty string
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String original = "  AI ET  is \t awesome \n ";
        String noWhitespace = removeWhitespace(original);

        System.out.println("Original String: \"" + original + "\"");
        System.out.println("String without whitespace: \"" + noWhitespace + "\"");
    }
}
