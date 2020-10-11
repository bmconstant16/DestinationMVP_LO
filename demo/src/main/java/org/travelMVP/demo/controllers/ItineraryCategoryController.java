package org.travelMVP.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.travelMVP.demo.data.ItineraryCategoryRepository;
import org.travelMVP.demo.data.TripRepository;
import org.travelMVP.demo.models.ItineraryCategory;
import org.travelMVP.demo.models.Trip;

import javax.validation.Valid;

@Controller
@RequestMapping("itinerarycategory")
public class ItineraryCategoryController {

        @Autowired
        private ItineraryCategoryRepository itineraryCategoryRepository;

//        displayAllItineraryTypes
    @GetMapping
    public String displayAllItineraryTypes(Model model){
        model.addAttribute("title", "All Itinerary Types");
        model.addAttribute("categories", itineraryCategoryRepository.findAll());
        return "itinerarycategory/index";
    }

    //renderCreateItineraryCategoryForm
    //get mapping handles routes to trips/create
    @GetMapping("create")
    public String displayCreateItineraryType(Model model){
    model.addAttribute("title", "Create Itinerary Type");
    model.addAttribute(new ItineraryCategory());
    return "itinerarycategory/create";
}

    //processsCreateItiniraryCategoryFrom
    //post mapping handles routes to itinerarycategory/create and saves a new trip object
    @PostMapping("create")
    public String processCreateItineraryTypeForm(@ModelAttribute @Valid ItineraryCategory newItineraryCategory,
                                        Errors errors, Model model){
        if (errors.hasErrors()){
            model.addAttribute("title", "Create Itinerary Category");
            return "itinerararycategory/create";
        }

        itineraryCategoryRepository.save(newItineraryCategory);
        return "redirect:"; //redirect to root path for controller trips in this case
    }

}
