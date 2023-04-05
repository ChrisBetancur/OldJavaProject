package Engine;

import Engine.GUI.Display;
import Engine.GUI.AirportListDisplay;
import Engine.GUI.SearchBar;
import Engine.GUI.ShellDisplay;
import Model.Airport;

import javax.swing.*;

public class Window extends JFrame {

    private AirportListDisplay airportListDisplay;
    private Display displaySelected;
    private SearchBar searchBar;
    private Airport[] currentAirportList;
    private ShellDisplay shellDisplay;

    public Window(int width, int height) {
        setLayout(null);

        displaySelected = new Display(this, 300, 400);
        displaySelected.setLocation(500, 112);

        airportListDisplay = new AirportListDisplay(this, displaySelected, 300, 400);
        airportListDisplay.setLocation(100, 190);
        currentAirportList = airportListDisplay.getProcessedAirportList();

        searchBar = new SearchBar(this, currentAirportList, 300, 20);
        searchBar.setLocation(300, 75);

        //shellDisplay = new ShellDisplay(this, 300, 20);
        //shellDisplay.setLocation(500, 800);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
