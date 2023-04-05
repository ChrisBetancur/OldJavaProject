package Airline;

import java.util.LinkedList;

public class Airport {

    String name;
    int ID;
    String location;
    LinkedList<Airport> connections;
    Airport(String name,int ID,String location){
        this.name=name;
        this.ID=ID;
        this.location=location;
        connections=new LinkedList<Airport>();
    }
}

