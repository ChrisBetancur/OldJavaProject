package Airline;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AirportConnections extends AirportList{
    private ArrayList<Airport> airports;
    int airportIndex=0;
    AirportConnections(){
        airports=new ArrayList<Airport>();
    }
    public Airport getAirport(int srcID){
        for(Airport x:airports){
            if(x.ID==srcID){
                return x;
            }
        }
        return null;
    }
    public Airport getAirport(String srcName){
        for(Airport x:airports){
            if(x.name==srcName){
                return x;
            }
        }
        return null;
    }
    private int assignID(){
        int ID=airportIndex;
        airportIndex++;
        return ID;
    }
    public int NametoID(String name){
        for(Airport curr:airports){
            if(curr.name==name){
                return curr.ID;
            }
        }
        return -1;
    }
    private String IDtoName(int ID){
        for(Airport curr:airports){
            if(curr.ID==ID) {
                return curr.name;
            }
        }
        return null;
    }
    public void addAirport(String srcName,String destName,String srcLoc,String destLoc){
        Airport src=getAirport(srcName);
        Airport dest=getAirport(destName);
        if(src==null){
            src=new Airport(srcName,assignID(),srcLoc);
        }
        if(dest==null){
            dest=new Airport(destName,assignID(),destLoc);
        }
        if(!src.connections.contains(dest)){
            src.connections.add(dest);
        }
        if(!airports.contains(src)){
            airports.add(src);
        }
        if(!airports.contains(dest)){
            airports.add(dest);
        }
    }
    public void printAirport(String name){
        Airport curr=getAirport(name);
        if(curr!=null) {
            System.out.print("Airport Name: " + curr.name + " ID: " + curr.ID + " Location: " + curr.location +" Connection: ");
            for(Airport temp:curr.connections){
                System.out.println("Airport Name: " + temp.name + " ID: " + temp.ID + " Location: " + temp.location+" ");
            }
            System.out.println();
        }
    }
    private void printAirport(String name,boolean simple){
        Airport curr=getAirport(name);
        if(curr!=null && simple==true){
            System.out.print(curr.name+" Conections: ");
            for(Airport temp:curr.connections){
                System.out.print(temp.name+", ");
            }
            System.out.println();
        }
    }
    public void printConnections(boolean simplify){
        if(airports!=null && simplify==false) {
            for (Airport curr : airports) {
                printAirport(curr.name);
            }
        }
        if(airports!=null && simplify==true) {
            for (Airport curr : airports) {
                printAirport(curr.name,true);
            }
        }
    }
    private void randomizeConnections(Airport curr,int sizeOfList,int listNumber){
        //Stack<Airport> included=new Stack<>();
        int random=(int)(Math.random()*sizeOfList+1);
        if(curr!=null){
            for(int i=0;i<random;i++) {
                int index = (int) ((Math.random() * sizeOfList));
                if(listNumber==1) {
                    if (APList1[index] != curr.name) {
                        addAirport(curr.name, APList1[index], curr.location, APLoc1[index]);
                    }
                }
                if(listNumber==2) {
                    if(APList1[index]!=curr.name) {
                        addAirport(curr.name, APList2[index], curr.location, APLoc2[index]);
                    }
                }
            }
        }
    }
    public void randomizeConnections(int listNumber) {
        if (listNumber == 1) {
            for (int i = 0; i < SIZE_LIST1; i++) {
                Airport temp = new Airport(APList1[i], assignID(), APLoc1[i]);
                randomizeConnections(temp,SIZE_LIST1,1);
            }
        }
        if(listNumber==2){
            for (int i = 0; i < SIZE_LIST2; i++) {
                Airport temp = new Airport(APList2[i], assignID(), APLoc2[i]);
                randomizeConnections(temp,SIZE_LIST2,2);
            }
        }
    }
    public void SearchFlightPath(String srcName,String destName){
        int srcID=NametoID(srcName);
        int destID=NametoID(destName);

        AirportSearch as=new AirportSearch(airports);

        as.hasDFS(srcID,destID);
        //LinkedList<Airport> a=as.getFlightPath();
        //as.printPath(a);
    }
}
