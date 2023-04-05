import Engine.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        //AirlineSystem airportSystem = new AirlineSystem();

        /* String resourceName = "C:\\Users\\chris\\IdeaProjects\\AirlineApplication\\src\\AirportData\\airports.json";

        JSONArray jsonarray = AirportDataReader.readJson(resourceName);

        Airport[] list = JsonToModel.convertToArray(jsonarray);



        CreateConnections createConnections = new CreateConnections(list);

        AirlineSystem demo = createConnections.getAirlineSystem(); */

        Window window = new Window(1000, 1000);

        System.out.println(window.getClass().getName() + "@" +System.identityHashCode(window));

    }
}
