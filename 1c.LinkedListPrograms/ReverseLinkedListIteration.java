/* 2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator()) */


package linkedlistprograms;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the LinkedList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Use descendingIterator() to iterate in reverse order
        Iterator<String> reverseIterator = colors.descendingIterator();

        System.out.println("LinkedList in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
