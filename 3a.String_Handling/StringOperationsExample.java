
/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/



package a3.StringHandling;
import java.util.Scanner;

public class StringOperationsExample {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 2 of s2: " + s2.charAt(2));

        // 3. String Comparison
        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("s1 equalsIgnoreCase 'hello'? " + s1.equalsIgnoreCase("hello"));
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        // 4. String Searching
        System.out.println("Index of 'l' in s1: " + s1.indexOf('l'));
        System.out.println("Last index of 'l' in s1: " + s1.lastIndexOf('l'));
        System.out.println("Does s2 contain 'or'? " + s2.contains("or"));

        // 5. Substring Operations
        System.out.println("Substring of s2 (1 to 4): " + s2.substring(1, 4));

        // 6. String Modification
        String replaced = s1.replace('l', 'p');
        System.out.println("s1 after replace: " + replaced);
        System.out.println("s1 to uppercase: " + s1.toUpperCase());
        System.out.println("s2 to lowercase: " + s2.toLowerCase());

        // 7. Whitespace Handling
        String s3 = "   Java Programming   ";
        System.out.println("Original string with spaces: '" + s3 + "'");
        System.out.println("Trimmed string: '" + s3.trim() + "'");

        // 8. String Concatenation
        String combined = s1 + " " + s2;
        System.out.println("Concatenated string: " + combined);

        // 9. String Splitting
        String fruits = "Apple,Banana,Cherry,Mango";
        String[] fruitArr = fruits.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruitArr) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, " Java");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        int age = 30;
        double salary = 12345.678;
        String formatted = String.format("Age: %d, Salary: $%.2f", age, salary);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email to validate: ");
        String email = scanner.nextLine();

        boolean validEmail = email.contains("@") &&
                             (email.startsWith("user") || email.startsWith("admin")) &&
                             email.endsWith(".com");

        if (validEmail) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Email is invalid!");
        }

        scanner.close();
    }
}
