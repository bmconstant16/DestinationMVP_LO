package org.travelMVP.demo.data;

import org.travelMVP.demo.models.Trip;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ItineraryData {

//TODO: refactor into a repo

        //place to put Trips
        private static final Map<Integer, Trip> itineraryItems = new HashMap<>();

        //get all the Trips
        public static Collection<Trip> getAll(){
            return itineraryItems.values();
        }

        //get a single trip
        public static Trip getById(int id){
            return itineraryItems.get(id);
        }
        //add a trip
        public static void add(Trip trip){
            itineraryItems.put(trip.getId(), trip);

        }

        //remove a trip
        public static void remove(int id){
            itineraryItems.remove(id);
        }

}
