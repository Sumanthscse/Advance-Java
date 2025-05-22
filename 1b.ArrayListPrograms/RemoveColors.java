package prg1b;

import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Green");   // This is the 2nd element (index 1)
        colors.add("Blue");
        colors.add("Yellow");

        // Display original list
        System.out.println("Original list of colors: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            colors.remove(1);
            System.out.println("After removing 2nd element: " + colors);
        } else {
            System.out.println("Not enough elements to remove the 2nd element.");
        }

        // Remove color "Blue" by value
        boolean removed = colors.remove("Blue");
        if (removed) {
            System.out.println("After removing 'Blue': " + colors);
        } else {
            System.out.println("'Blue' was not found in the list.");
        }
    }
}
