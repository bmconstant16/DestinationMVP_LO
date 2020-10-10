package org.travelMVP.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.travelMVP.demo.data.TripRepository;
import org.travelMVP.demo.models.Trip;

import javax.validation.Valid;

@Controller
@RequestMapping("trips")
public class TripController {

    @Autowired
    private TripRepository tripRepository;

    //findall, save, findbyId, delete, count

    //view all
    @GetMapping
    public String displayAllTrips(Model model){
        model.addAttribute("title", "All Trips");
        model.addAttribute("trips", tripRepository.findAll());
        return "trips/index";
    }

    //get mapping handles routes to trips/create
    @GetMapping("create")
    public String displayCreateTripForm(Model model){
        model.addAttribute("title", "Create Trip");
        model.addAttribute(new Trip());
        return "trips/create";
    }

    //post mapping handles routes to trips/create and saves a new trip object
    @PostMapping("create")
    public String processCreateTripForm(@ModelAttribute @Valid Trip newTrip,
                                        Errors errors, Model model){
        if (errors.hasErrors()){
            model.addAttribute("title", "Create Trip");
            return "trips/create";
        }

        tripRepository.save(newTrip);
        return "redirect:"; //redirect to root path for controller trips in this case
    }

    //trips delete displays the delete trip form
    @GetMapping("delete")
    public String displayDeleteTripForm(Model model) {
        model.addAttribute("title", "Delete Trip");
        model.addAttribute("events", tripRepository.findAll());
        return "trips/delete";
    }

    //deletes a trip object from the database
    @PostMapping("delete")
    public String processDeleteTripForm(@RequestParam(required = false) int[] eventIds) {

        if (eventIds != null) {
            for (int id : eventIds) {
                tripRepository.deleteById(id);
            }
        }

        return "redirect:";
    }


}
