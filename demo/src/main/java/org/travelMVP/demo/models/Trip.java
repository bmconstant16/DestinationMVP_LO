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
    private String startDate;
    private String endDate;
    private String description;
    private String companions;
    private String url;

    public Trip() {
    }

    public Trip(String name, String description) {
        this.name = name;
        this.description = description;
        this.id= nextId;
        nextId++;
    }

    public Trip(String name, String startDate, String endDate, String description, String companions, String url) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
