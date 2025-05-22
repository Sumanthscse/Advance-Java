package prg1b;

import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display original list
        System.out.println("Original list of colors: " + colors);

        // Sort the list using Collections.sort()
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted list of colors: " + colors);
    }
}
