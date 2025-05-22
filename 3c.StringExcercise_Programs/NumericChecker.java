/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/


package c3.StringExerciseprogams;

public class NumericChecker {

    // Function to check if a string contains only digits
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Loop through each character and check if it is a digit
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "123456";
        String test2 = "123a456";

        System.out.println(test1 + " is numeric? " + isNumeric(test1));
        System.out.println(test2 + " is numeric? " + isNumeric(test2));
    }
}
