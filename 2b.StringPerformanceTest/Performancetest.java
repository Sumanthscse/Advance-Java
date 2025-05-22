
/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/




package b2.StringPerformanceTest;

public class Performancetest {

	public static void main(String[] args) {
        int iterations = 10000;
        String appendStr = "AIET";

        // Test StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendStr);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendStr);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("Time taken by StringBuffer (nanoseconds): " + durationBuffer);
        System.out.println("Time taken by StringBuilder (nanoseconds): " + durationBuilder);

        // Justification
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer for appending strings.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("StringBuffer is faster than StringBuilder for appending strings.");
        } else {
            System.out.println("Both StringBuffer and StringBuilder took the same time.");
        }
    }
}
