/* 5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan   */


package d5.Swing_Jcolor;

import javax.swing.*;
import java.awt.*;

public class CMYTabbedPane {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("CMY Tabbed Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create JPanel for Cyan
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        // Create JPanel for Magenta
        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        // Create JPanel for Yellow
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add tabbedPane to frame
        frame.add(tabbedPane);

        // Center and display the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
