/* Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString() */





package c3.StringExerciseprogams;

import java.util.Random;

public class RandomStringGenerator {

    // Function to generate a random string of given length
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int length = 10;
        String randomString = generateRandomString(length);

        System.out.println("Random String of length " + length + ": " + randomString);
    }
}
