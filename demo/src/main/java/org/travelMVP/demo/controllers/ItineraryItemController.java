package org.travelMVP.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.travelMVP.demo.data.ItineraryCategoryRepository;
import org.travelMVP.demo.data.ItineraryItemRepository;
import org.travelMVP.demo.models.ItineraryItem;

import javax.validation.Valid;

@Controller
@RequestMapping(value="itineraries")
public class ItineraryItemController {

    @Autowired
    private ItineraryItemRepository itineraryItemRepository;

    @Autowired
    private ItineraryCategoryRepository itineraryCategoryRepository;

    //findall, save, findbyId, delete, count

    //view all
    @GetMapping
    public String displayAllItineraryItems(Model model){
        model.addAttribute("title", "All Itinerary Items");
        model.addAttribute("itineraryItems", itineraryItemRepository.findAll());
        return "/itineraries/index";
    }

    //get mapping handles routes to itineraries/create
    @GetMapping("create")
    public String displayCreateItineraryItemForm(Model model){
        model.addAttribute("title", "Create Itinerary Item");
        model.addAttribute(new ItineraryItem());
        model.addAttribute("categories", itineraryCategoryRepository.findAll());
        return "itineraries/create";
    }

    //post mapping handles routes to itineraries/create and saves a new itinerary object
    @PostMapping("create")
    public String processItineraryItem(@ModelAttribute @Valid ItineraryItem newItineraryItem,
                                      Errors errors, Model model){

        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Itinerary Item");
            return "itineraries/create";
        }

        itineraryItemRepository.save(newItineraryItem);
        return "redirect:"; //redirect to root path for controller itinerary items in this case
    }

    //displays the delete itinerary item form
    @GetMapping("delete")
    public String displayDeleteItineraryItemForm(Model model) {
        model.addAttribute("title", "Delete Itinerary Item");
        model.addAttribute("itineraryItems", itineraryItemRepository.findAll());
        return "itineraries/delete";
    }

    //deletes an itinerary object from the database
    @PostMapping("delete")
    public String processDeleteItineraryItemForm(@RequestParam(required = false) int[] eventIds) {

        if (eventIds != null) {
            for (int id : eventIds) {
                itineraryItemRepository.deleteById(id);
            }
        }

        return "redirect:";
    }




}
