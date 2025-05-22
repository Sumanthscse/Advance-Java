/* 6. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index */



package prg1b;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNthColor {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Get user input for the n-th element to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of the element to remove (starting from 1): ");
        int n = scanner.nextInt();
        scanner.close();

        // Check if n is valid
        if (n > 0 && n <= colors.size()) {
            // Remove the (n-1)th element since index starts from 0
            String removedColor = colors.remove(n - 1);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid position. Please enter a number between 1 and " + colors.size());
        }

        // Display the updated list
        System.out.println("Updated list of colors: " + colors);
    }
}

