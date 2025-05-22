/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/


package b3.StringPrograms;

public class PalindromeChecker {

    // Function to check palindrome ignoring case and punctuation
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Remove all non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "Hello World";

        System.out.println("\"" + test1 + "\" is palindrome? " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is palindrome? " + isPalindrome(test2));
    }
}
