package Engine.GUI;

import Model.Airport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static SearchEngine.FindAirport.getAirportsByInput;

public class SearchBar {

    private JTextField searchBar;
    private Dimension searchBarSize;

    private Button btnSearch;
    private Dimension btnSearchSize;

    //private final Filter[] searchFilters;

    private int xPos;
    private int yPos;

    private class Filter {
        public Filter() {

        }
    }

    public SearchBar(JFrame frame, Airport[] airportList, int width, int height) {
        searchBar = new JTextField();
        searchBarSize = new Dimension(width, height);

        btnSearch = new Button("Search");
        btnSearchSize = new Dimension(75, 20);

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello");
                getAirportsByInput(searchBar.getText(),false, airportList);

                /*FilterDialog filterDialog = new FilterDialog(frame, new String[]{
                        "Hey",
                        "gg",
                        "Hey",
                        "yo",
                        "Hey",
                });*/


                /*String[] options = {"abc", "def", "ghi", "jkl"};
                int x = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
                        "Click a button",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                System.out.println(x);*/
            }
        });

        frame.add(searchBar);
        frame.add(btnSearch);
    }

    public void setLocation(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        searchBar.setBounds(xPos, yPos,
                searchBarSize.width, searchBarSize.height);
        btnSearch.setBounds(xPos + 310, yPos,
                btnSearchSize.width, btnSearchSize.height);
    }
}
