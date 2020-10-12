package org.travelMVP.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ItineraryCategory extends AbstractEntity{


    private String name;

    //name of the field in the class we're storing which is itineraryItem. the relationship owned by itineraryItem
    @OneToMany(mappedBy= "itineraryCategory")
    private final List<ItineraryItem> itineraryItems = new ArrayList<>();

    public ItineraryCategory(){
    }

    public ItineraryCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItineraryItem> getItineraryItems() {
        return itineraryItems;
    }

    @Override
    public String toString() {
        return name;
    }


}
