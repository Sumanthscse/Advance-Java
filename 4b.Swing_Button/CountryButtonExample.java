/* 4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ). */


package b4.Swing_Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryButtonExample {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Country Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create two buttons
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");

        // Create a label to display the message
        JLabel messageLabel = new JLabel("Press a button");

        // Add action listeners to buttons
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add components to the frame
        frame.add(indiaButton);
        frame.add(srilankaButton);
        frame.add(messageLabel);

        // Make the frame visible
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
