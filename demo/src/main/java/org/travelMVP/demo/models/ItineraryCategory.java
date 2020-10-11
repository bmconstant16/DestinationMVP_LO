package org.travelMVP.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItineraryCategory extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;

    private String name;

    public ItineraryCategory(){;
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


}
