package org.travelMVP.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("trips")
public class TripController {

    @GetMapping
    public String displayAllTrips(Model model){
        //TODO: consider using a hashmap? each trip, should have an associated list of itin items
        List<String> trips = new ArrayList<>();
        trips.add("Romania 2019");
        trips.add("Switzerland 2019");
        trips.add("Portugal 2020");
        trips.add("Tennessee USA 2020");
        model.addAttribute("trips", trips);
        return "trips/index";
    }
}
