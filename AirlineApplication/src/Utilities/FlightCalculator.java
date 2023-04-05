package Utilities;

import Model.GeoLoc;

public class FlightCalculator {
    public static double calculateDistance(GeoLoc source, GeoLoc destination) {
        double theta = source.getLongitude() - destination.getLongitude();
        double dist = Math.sin(Math.toRadians(source.getLatitude())) * Math.sin(Math.toRadians(destination.getLatitude()))
                + Math.cos(Math.toRadians(source.getLatitude())) * Math.cos(Math.toRadians(destination.getLatitude())) * Math.cos(Math.toRadians(theta));
        dist = Math.acos(dist);
        dist = Math.toDegrees(dist);
        dist = dist * 60 * 1.1515;
        dist = dist * 1.609344; // In Km
        return (dist);
    }
}

