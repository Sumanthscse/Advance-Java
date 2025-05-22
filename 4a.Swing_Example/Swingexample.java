/*  4a. Basic hello program of Swing displaying the message
 Hello! VI C , Welcome to Swing Programming in Blue color plain font
 with font size of 32 using JFrame and JLabel */

package a4.Swing_Example;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Swingexample {

    public static void main(String[] args) {
        // Create JFrame instance
        JFrame frame = new JFrame("Swing Hello Program");

        // Create JLabel with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", JLabel.CENTER);

        // Set font: plain style, size 32
        label.setFont(new Font("Serif", Font.PLAIN, 32));
        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set size of frame
        frame.setSize(700, 150);
        // Center the frame on screen
        frame.setLocationRelativeTo(null);
        // Make the frame visible
        frame.setVisible(true);
    }
}