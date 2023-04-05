package Airline;

public class SystemOperations {
    public static void main(String[] args) {
        AirportConnections AS=new AirportConnections();
       // AS.addAirport("Madeira Airport","Denver International Airport","Portugal","Colorado,USA");
        AS.randomizeConnections(2);
        AS.printConnections(true);
        System.out.println();
        AS.SearchFlightPath("Madeira Airport","Beijing International Airport  ");
        //System.out.println(AS.NametoID("Hong Kong International Airport"));
        String a="ff";
        System.out.print(a.length());
    }
}
