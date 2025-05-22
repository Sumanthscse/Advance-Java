/* 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list. */






package a5.Jlist_Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryListDemo {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Country List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark", "France",
            "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JList with countries
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6); // Show 6 rows at a time
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add the list to a scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add selection listener
        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                java.util.List<String> selected = countryList.getSelectedValuesList();
                System.out.println("Selected countries: " + selected);
            }
        });

        // Add components to frame
        frame.add(scrollPane);

        // Make the frame visible
        frame.setLocationRelativeTo(null); // Center window
        frame.setVisible(true);
    }
}
