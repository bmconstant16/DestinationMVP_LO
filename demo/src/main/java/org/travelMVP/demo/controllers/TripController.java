package org.travelMVP.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.travelMVP.demo.models.Trip;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("trips")
public class TripController {

    //TODO: consider using a hashmap? each trip, should have an associated list of itin items
    private static List<Trip> trips = new ArrayList<>();

    @GetMapping
    public String displayAllTrips(Model model){
        //TODO: refactor this so it's not a static list
//        List<String> trips = new ArrayList<>();
//        trips.add("Romania 2019");
//        trips.add("Switzerland 2019");
//        trips.add("Portugal 2020");
//        trips.add("Tennessee USA 2020");
//        model.addAttribute("trips", trips);
        model.addAttribute("trips", trips);
        return "trips/index";
    }

    //get mapping handles routes to trips/create
    @GetMapping("create")
    //TODO: refactor so it takes string name and a date- is there a type for this?
    public String renderCreateTripForm(){
        return "trips/create";
    }

    //post mapping handles routes to trips/create
    @PostMapping("create")
    public String createTrip(@RequestParam String tripName,
                             @RequestParam String tripDescription){
        trips.add(new Trip(tripName, tripDescription));
        return "redirect:"; //redirect to root p ath for controller trips in this case
    }
}
