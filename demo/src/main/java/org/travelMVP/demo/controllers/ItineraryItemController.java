package org.travelMVP.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.travelMVP.demo.data.ItineraryData;
import org.travelMVP.demo.models.ItineraryItem;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="itineraries")
public class ItineraryItemController {

    //TODO: figure out the itinerary item controller
//    List<String> itinerary = new ArrayList<>();

    @GetMapping
    public String displayAllItinItems(Model model){
//        List<String> itinerary = new ArrayList<>();
//        itinerary.add("flight");
//        itinerary.add("hotel");
//        itinerary.add("train");
//        itinerary.add("brewery tour");
        model.addAttribute("title", "All Itinerary Items");
//        model.addAttribute("itinerary", itinerary);
        model.addAttribute("itineraryitems", ItineraryData.getAll());
        return "/itineraries/index";
    }

    @GetMapping("create")
    public String renderCreateItineraryItemForm(Model model){
        model.addAttribute("title", "Create Itinerary Item");
        model.addAttribute(new ItineraryItem());
        return "itineraries/create";
    }

    //post mapping handles routes to itineraries/create
    @PostMapping("create")
    public String createItineraryItem(@ModelAttribute @Valid ItineraryItem newItineraryItem,
                                      Errors errors, Model model){
        return "redirect:"; //redirect to root path for controller itinerary items in this case
    }



}
