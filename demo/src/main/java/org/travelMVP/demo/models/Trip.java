package org.travelMVP.demo.models;

import javax.persistence.Entity;
import java.text.DateFormat;
import java.util.Date;
import java.util.Objects;

//@Entity
public class Trip {

    private int id;
    private static int nextId = 1;

    private String name;
    private String date;
    private String description;
    private String companions;
    private String url;

    public Trip(String name, String description) {
        this.name = name;
        this.description = description;
        this.id= nextId;
        nextId++;
    }

    public Trip(String name, String date, String description, String companions, String url) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.companions= companions;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanions() {
        return companions;
    }

    public void setCompanions(String companions) {
        this.companions = companions;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return id == trip.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
