/* 1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1)) */


package linkedlistprograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterationFromSecond {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the LinkedList
        colors.add("Red");    // index 0
        colors.add("Blue");   // index 1 (2nd position)
        colors.add("Green");  // index 2
        colors.add("Yellow"); // index 3
        colors.add("Orange"); // index 4

        // Display the full list
        System.out.println("Full list: " + colors);

        // Create a ListIterator starting from index 1 (2nd position)
        ListIterator<String> iterator = colors.listIterator(1);

        System.out.println("Iterating from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
