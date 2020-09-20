package org.travelMVP.demo.data;

import org.travelMVP.demo.models.Trip;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TripData {
//TODO: refactor into a repo

    //place to put Trips
    private static final Map<Integer, Trip> trips = new HashMap<>();

    //get all the Trips
    public static Collection<Trip> getAll(){
        return trips.values();
    }

    //get a single trip
    public static Trip getById(int id){
        return trips.get(id);
    }
    //add a trip
    public static void add(Trip trip){
        trips.put(trip.getId(), trip);

    }

    //remove a trip
    public static void remove(int id){
        trips.remove(id);
    }

}
