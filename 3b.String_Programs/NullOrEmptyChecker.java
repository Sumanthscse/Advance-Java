/* Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty(). */


package b3.StringPrograms;

import java.util.Scanner;

public class NullOrEmptyChecker {

    // User-defined function to check null or empty (only whitespace)
    public static boolean isNullOrEmpty(String str) {
        // Check if string is null or if trimmed string is empty
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("The string is either null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }

        scanner.close();
    }
}
