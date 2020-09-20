package org.travelMVP.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.travelMVP.demo.data.TripData;
import org.travelMVP.demo.models.Trip;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("trips")
public class TripController {

    //TODO: consider using a hashmap? each trip, should have an associated list of itin items
//    private static List<Trip> trips = new ArrayList<>();

    @GetMapping
    public String displayAllTrips(Model model){
        model.addAttribute("trips", TripData.getAll());
        return "trips/index";
    }

    //get mapping handles routes to trips/create
    @GetMapping("create")
    //TODO: refactor so it takes string name and a date- is there a type for this?
    public String renderCreateTripForm(Model model){
        model.addAttribute("title", "Create Trip");
        model.addAttribute((new Trip()));
        return "trips/create";
    }

    //post mapping handles routes to trips/create
    @PostMapping("create")
    public String processCreateTripForm(@ModelAttribute @Valid Trip newTrip,
                                        Errors errors, Model model){
        if (errors.hasErrors()){
            model.addAttribute("title", "Create Trip");
            return "trips/create";
        }

        TripData.add(newTrip);
        return "redirect:"; //redirect to root path for controller trips in this case
    }


}
