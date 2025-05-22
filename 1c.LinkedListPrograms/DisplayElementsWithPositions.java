/* 4. Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) ) */


package linkedlistprograms;

import java.util.LinkedList;

public class DisplayElementsWithPositions {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Add elements to the list
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Pink");

        // Display elements with their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println("Position " + i + ": " + colorList.get(i));
        }
    }
}
