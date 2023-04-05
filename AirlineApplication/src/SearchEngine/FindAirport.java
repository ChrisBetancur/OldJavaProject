package SearchEngine;

import Model.Airport;

import java.util.ArrayList;

public class FindAirport {
    public static void getAirportsByInput(String input, boolean findAll, Airport[] airportList) {
        ArrayList<Airport> possibleAirports = new ArrayList<>();
        for(int index = 0; index < airportList.length; index++) {
            for(int stringIndex = 0; stringIndex < airportList[index].getName().length() - input.length(); stringIndex++) {
                String lowerCaseName = airportList[index].getName().toLowerCase();
                if(lowerCaseName.substring(stringIndex, stringIndex + input.length()).equals(input)) {
                    possibleAirports.add(airportList[index]);
                    break;
                }
            }
        }
        for(Airport airport : possibleAirports) {
            airport.printAirport();
        }
    }

    public static void getAirportsBySize() {

    }

}
