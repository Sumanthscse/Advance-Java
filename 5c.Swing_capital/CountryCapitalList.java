/* 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list. */




package c5.Swing_capital;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class CountryCapitalList {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Country-Capital Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark", "France",
            "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Map of countries to capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Varies by country");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add to scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add list selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    for (String country : selectedCountries) {
                        String capital = capitals.getOrDefault(country, "Unknown");
                        System.out.println("Capital of " + country + " is: " + capital);
                    }
                    System.out.println("-----------------------------");
                }
            }
        });

        // Add to frame
        frame.add(scrollPane);

        // Show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
