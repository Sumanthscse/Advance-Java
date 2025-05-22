/* 5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2)) */




package linkedlistprograms;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElementsInLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the list
        colors.add("Red");     // index 0
        colors.add("Blue");    // index 1
        colors.add("Green");   // index 2
        colors.add("Yellow");  // index 3

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Swap first (index 0) and third (index 2) elements
        Collections.swap(colors, 0, 2);

        // Display the list after swapping
        System.out.println("LinkedList after swapping first and third elements: " + colors);
    }
}
