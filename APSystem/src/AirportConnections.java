
import java.util.ArrayList;

public class AirportConnections {
    private ArrayList<Airport> airports;
    int airportIndex=0;
    AirportConnections(){
        airports=new ArrayList<Airport>();
    }
    private Airport getAirport(int srcID){
        for(Airport x:airports){
            if(x.ID==srcID){
                return x;
            }
        }
        return null;
    }
    private Airport getAirport(String srcName){
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
                System.out.print("Airport Name: " + temp.name + " ID: " + temp.ID + " Location: " + temp.location+" ");
            }
        }
    }
    public void printConnections(){
        if(airports!=null) {
            for (Airport curr : airports) {
                printAirport(curr.name);
            }
        }
    }
}
