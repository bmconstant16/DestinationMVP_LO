package org.travelMVP.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="itineraries")
public class ItineraryItemController {

    //TODO: figure out the itinerary item controller
    List<String> itinerary = new ArrayList<>();

    @GetMapping
    public String displayItinItems(Model model){

//        List<String> itinerary = new ArrayList<>();
        itinerary.add("flight");
        itinerary.add("hotel");
        itinerary.add("train");
        itinerary.add("brewery tour");
        model.addAttribute("itinerary", itinerary);
        return "/itineraries/index";
    }

    @GetMapping("create")
    public String renderCreateItineraryItemForm(){
        return "itineraries/create";
    }

    //post mapping handles routes to itineraries/create
    @PostMapping("create")
    public String createItineraryItem(@RequestParam String itinItem){
        itinerary.add(itinItem);
        return "redirect:"; //redirect to root path for controller trips in this case
    }



}
