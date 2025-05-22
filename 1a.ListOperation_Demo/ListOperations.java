/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list */


package prg1;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        // Initial lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        // 3. Adding multiple elements
        List<String> additionalFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(additionalFruits);
        linkedList.addAll(additionalFruits);

        // 4. Accessing elements
        System.out.println("ArrayList element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(2, "Kiwi");
        linkedList.set(2, "Kiwi");

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        arrayList.remove(0); // remove first element
        linkedList.remove(0);

        // 7. Searching elements
        System.out.println("Does ArrayList contain 'Orange'? " + arrayList.contains("Orange"));
        System.out.println("Does LinkedList contain 'Orange'? " + linkedList.contains("Orange"));

        // 8. List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list using for-each loop
        System.out.println("\nArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nLinkedList elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nArrayList using Iterator:");
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("\nLinkedList using Iterator:");
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);

        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> subArrayList = arrayList.subList(0, 2);
        List<String> subLinkedList = linkedList.subList(0, 2);

        System.out.println("\nSublist of ArrayList: " + subArrayList);
        System.out.println("Sublist of LinkedList: " + subLinkedList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();

        System.out.println("\nArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
