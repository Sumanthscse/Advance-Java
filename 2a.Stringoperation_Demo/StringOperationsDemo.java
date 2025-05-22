/* 2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/




package a2.StringOperationDemo;

import java.util.Scanner;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str2: " + str2.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        System.out.println("'World' starts at index: " + str2.indexOf("World"));
        System.out.println("'o' in str1 last appears at index: " + str1.lastIndexOf('o'));

        // 5. Substring Operations
        System.out.println("Substring of str2 (index 1 to 4): " + str2.substring(1, 4));

        // 6. String Modification
        String replacedStr = str1.replace('l', 'p');
        System.out.println("str1 after replacing 'l' with 'p': " + replacedStr);
        System.out.println("str1 to uppercase: " + str1.toUpperCase());
        System.out.println("str2 to lowercase: " + str2.toLowerCase());

        // 7. Whitespace Handling
        String strWithSpaces = "   Java Programming   ";
        System.out.println("Original string with spaces: '" + strWithSpaces + "'");
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concatStr = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatStr);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange,Mango";
        String[] fruitArray = fruits.split(",");
        System.out.println("Fruits after splitting:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, " Java");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        int age = 25;
        double price = 99.99;
        String formattedStr = String.format("Age: %d, Price: $%.2f", age, price);
        System.out.println("Formatted string: " + formattedStr);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email to validate: ");
        String email = scanner.nextLine();
        scanner.close();

        if (email.contains("@") && email.endsWith(".com") && (email.startsWith("user") || email.startsWith("admin"))) {
            System.out.println("Email is valid based on contains, startsWith, and endsWith.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}
