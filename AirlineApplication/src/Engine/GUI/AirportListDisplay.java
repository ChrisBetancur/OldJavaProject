package Engine.GUI;

import Engine.Processor;
import Model.Airport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AirportListDisplay {
    private int xListDisplay;
    private int yListDisplay;

    private JList airportList;
    private JScrollPane listScroller;
    private Dimension listSize;

    private Processor processor;

    private Display display;

    private Airport selectedAirport;

    public AirportListDisplay(JFrame frame, Display display, int width, int height) {
        this.display = display;
        processor = null;
        try {
            processor = new Processor();
            processor.initProcessor();
            airportList = processor.initializeList(airportList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Processor finalProcessor = processor;
        airportList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedAirport = finalProcessor.getList()[(airportList.getSelectedIndex())];
                updateAirportDisplay(selectedAirport);
            }
        });
        listScroller = new JScrollPane(airportList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        listSize = new Dimension(width, height);
        frame.add(listScroller);
    }

    public void setLocation(int x, int y) {
        this.xListDisplay = x;
        this.yListDisplay = y;
        listScroller.setBounds(xListDisplay, yListDisplay,
                listSize.width, listSize.height);
    }

    public Airport[] getProcessedAirportList() {
        return processor.getList();
    }

    public void updateAirportDisplay(Airport airport) {
        display.update(airport);
    }

    public JScrollPane getDisplay() {
        return listScroller;
    }
}
