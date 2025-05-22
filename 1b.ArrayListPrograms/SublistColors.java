/* 5. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList() */



package prg1b;

import java.util.ArrayList;
import java.util.List;

public class SublistColors {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");     // index 0
        colors.add("Blue");    // index 1
        colors.add("Green");   // index 2
        colors.add("Yellow");  // index 3
        colors.add("Orange");  // index 4

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Extract 1st and 2nd elements using subList (index 0 to 2 exclusive)
        List<String> subColors = colors.subList(0, 2);

        // Display the extracted sublist
        System.out.println("Extracted 1st and 2nd elements: " + subColors);
    }
}
