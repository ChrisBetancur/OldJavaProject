package Utilities;

import Model.Airplane;
import Model.Airport;
import Model.GeoLoc;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonToModel {
    public static Airport[] convertToArray(JSONArray jsonArray) {
        Airport[] listOfAirports = new Airport[jsonArray.length()];
        for(int i = 0; i < jsonArray.length(); i++) {
            listOfAirports[i] = convertToModel(jsonArray.getJSONObject(i));
        }
        return listOfAirports;
    }
    private static Airport convertToModel(JSONObject jsonObject) {
        String[] airportString = jsonObject.getString("name").split(" ");
        //String locaton = jsonObject.getString("_geoloc");
        JSONObject location = jsonObject.getJSONObject("_geoloc");
        int size = 0;
        if(airportString[airportString.length - 1].equals("Intl")) {
            size = 20;
        }
        else {
            size = 10;
        }
        return new Airport(jsonObject.getString("name"), Integer.parseInt(jsonObject.getString("objectID")), size, new GeoLoc(location.getFloat("lat"), location.getFloat("lng")));
    }
}
