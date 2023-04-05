package Airline;



import java.util.ArrayList;
import java.util.LinkedList;

public class AirportSearch {
    private boolean finish=false;
    private ArrayList<Airport> list;
    private LinkedList<Airport> flightPath;
    //private ArrayList<Airport> flightPath2;
    final String ID_NOT_FOUND="Error: Airport ID not found";
    AirportConnections AC=new AirportConnections();

    AirportSearch(ArrayList<Airport> list){
        this.list=list;
        flightPath=new LinkedList<>();
    }
    private Airport getAirport(int srcID){
        for(Airport x:list){
            if(x.ID==srcID){
                return x;
            }
        }
        return null;
    }
    public boolean hasDFS(int sourceID,int destinationID){
        ArrayList<String> visited;
        Airport src=getAirport(sourceID);
        Airport dest=getAirport(destinationID);

        //if(src!=null && dest!=null){
            visited=new ArrayList<>();
            return hasDFS(src,dest,visited);
    }

    public LinkedList<Airport> getFlightPath() {
        return flightPath;
    }

    private boolean hasDFS(Airport src, Airport dest, ArrayList<String> visited){
        if(visited.contains(src.name)){
            return false;
        }
        if(src==dest){
            return true;
        }
        visited.add(src.name);
        flightPath.add(src);
        System.out.print(src.name+"->");
        for(Airport curr:src.connections){
            if(hasDFS(curr,dest,visited)){
                System.out.print(curr.name);
                flightPath.add(curr);
                return true;
            }
        }
        return false;
    }
    public void printPath(LinkedList<Airport> path){
        if(path!=null){
            for(Airport curr:path){
                System.out.print(curr.name+" connection to ");
            }
        }
    }
}
