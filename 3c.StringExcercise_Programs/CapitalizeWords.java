/* Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords() */




package c3.StringExerciseprogams;

public class CapitalizeWords {

    // Function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");  // Split by whitespace
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter + add rest of the word in lowercase
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase());
            }
            capitalized.append(" ");
        }

        // Remove trailing space and return
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String original = "java programming language";
        String result = capitalizeWords(original);

        System.out.println("Original String: " + original);
        System.out.println("Capitalized String: " + result);
    }
}
