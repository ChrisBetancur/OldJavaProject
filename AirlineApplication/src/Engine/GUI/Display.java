package Engine.GUI;

import Model.Airport;

import javax.swing.*;
import java.awt.*;

public class Display {
    private JTabbedPane airportTabbedDisplay;
    private Dimension displaySize;

    private JLabel displayTitle;
    private Dimension titleSize;

    private int xPos;
    private int yPos;

    public Display(JFrame frame, int width, int height) {
        displayTitle = new JLabel("Airport: None selected");
        titleSize = new Dimension(300, 100);

        airportTabbedDisplay = new JTabbedPane();
        displaySize = new Dimension(width, height);

        //airportTabbedDisplay.addTab("Details", null);
        //airportTabbedDisplay.addTab("Connections", null);

        frame.add(displayTitle);
        frame.add(airportTabbedDisplay);
    }

    private Box createConnectionsPanel(Airport airport) {

        Box box = Box.createVerticalBox();
        //box.setBackground(Color.WHITE);

        //JList list = new JList(airport.getConnections());
        //JScrollPane listScroller = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        for(Airport currAirport : airport.getConnections()) {
            JLabel lbl = new JLabel(currAirport.getName());
            lbl.setAlignmentX(Component.LEFT_ALIGNMENT);
            box.add(lbl);
            //list.add(lbl);
        }

        return box;
    }

    private Box createInfoPanel(Airport airport) {
        Box box = Box.createVerticalBox();

        JLabel id = new JLabel(airport.getName());
        box.add(id);

        JLabel lng = new JLabel("Latitude: " + Double.toString(airport.getAirportLoc().getLatitude()));
        box.add(lng);

        JLabel lat = new JLabel("Longitude: " + Double.toString(airport.getAirportLoc().getLongitude()));
        box.add(lat);

        int numOfConnects = 0;
        for(Airport curr : airport.getConnections()) {
            numOfConnects++;
        }
        JLabel connections = new JLabel("Connections: " + Integer.toString(numOfConnects));
        box.add(connections);

        JLabel capacity = new JLabel("Capacity: " + Integer.toString(airport.getAirplaneCapacity()));
        box.add(capacity);

        return box;
    }

    public void setLocation(int x, int y) {
        this.xPos = x;
        this.yPos = y;
        displayTitle.setBounds(xPos, yPos,
                titleSize.width, titleSize.height);
        airportTabbedDisplay.setBounds(xPos, yPos + 77,
                displaySize.width, displaySize.height);
    }

    public void update(Airport airport) {
        this.setText(airport.getName());
        //this.airportTabbedDisplay.remove(0);
        //this.airportTabbedDisplay.remove(1);
        this.airportTabbedDisplay.removeAll();
        this.airportTabbedDisplay.addTab("Details", createInfoPanel(airport));
        this.airportTabbedDisplay.addTab("Connections", createConnectionsPanel(airport));
    }

    public void setText(String name) {
        String text = "Airport: " + name;
        displayTitle.setText(text);
    }
}
