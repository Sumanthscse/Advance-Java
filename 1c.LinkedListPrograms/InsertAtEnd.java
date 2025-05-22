/* 3. Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink")) */



package linkedlistprograms;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Add initial elements
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Insert "Pink" at the end using offerLast()
        colorList.offerLast("Pink");

        // Display the updated list
        System.out.println("Updated LinkedList after adding 'Pink' at the end: " + colorList);
    }
}
