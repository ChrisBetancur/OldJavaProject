package Engine;

import Airline.AirlineSystem;
import Model.Airport;
import Simulation.CreateConnections;
import Utilities.AirportDataReader;
import Utilities.JsonToModel;
import org.json.JSONArray;

import javax.swing.*;
import java.io.IOException;
import java.util.Vector;

public class Processor {
    private AirlineSystem airlineSystem;
    private Airport[] list;

    public Processor() throws IOException {
        String resourceName = "C:\\Users\\chris\\IdeaProjects\\AirlineApplication\\src\\AirportData\\airports.json";

        JSONArray jsonarray = AirportDataReader.readJson(resourceName);

        Airport[] list = JsonToModel.convertToArray(jsonarray);
        this.list = list;
        //CreateConnections createConnections = new CreateConnections(list);

        //airlineSystem = createConnections.getAirlineSystem();
    }

    public void initProcessor() {
        CreateConnections createConnections = new CreateConnections(list);
        createConnections.generateConnections();
        airlineSystem = createConnections.getAirlineSystem();
    }

    public Processor(AirlineSystem airlineSystem) {
        this.airlineSystem = airlineSystem;
    }

    public JList initializeList(JList airportList) {
        String[] demo = new String[this.list.length];

        for(int i = 0; i < this.list.length; i++) {
            demo[i] = this.list[i].getName();
        }

        return new JList(demo);
    }

    public Airport[] getList() {
        return list;
    }
}
