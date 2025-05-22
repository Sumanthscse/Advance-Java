/*  Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/

package c3.StringExerciseprogams;

public class StringTruncator {

    // Function to truncate a string to maxLength and add ellipsis if needed
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength <= 0) {
            return "";
        }

        if (input.length() <= maxLength) {
            return input;
        }

        // Substring up to maxLength, then add "..."
        return input.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {
        String original = "Artificial Intelligence and Emerging Technologies";
        int maxLength = 20;

        String truncated = truncate(original, maxLength);

        System.out.println("Original String: " + original);
        System.out.println("Truncated String: " + truncated);
    }
}
