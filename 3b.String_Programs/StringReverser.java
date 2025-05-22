/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/




package b3.StringPrograms;

public class StringReverser {

    // Function to reverse the characters in a string
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder();

        // Loop from the end of the string to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "AIET";
        String reversed = reverseString(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
