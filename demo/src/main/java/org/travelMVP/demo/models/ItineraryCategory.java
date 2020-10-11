package org.travelMVP.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItineraryCategory {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    public ItineraryCategory(){;
    }

    public ItineraryCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
