package org.travelMVP.demo.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class ItineraryItem {

    private int id;
    private static int nextId=1;

    @NotBlank(message="Name is required.")
    private String name;

    @NotBlank(message="Description is required")
    private String description;

    @NotNull
    private String startDate;

    @NotNull
    private String startTime;

    @NotNull
    private String endDate;

    @NotNull
    private String endTime;

    @NotNull
    private String type;

    @NotNull
    private String address;

    private String latitude;
    private String longitude;
    private String coordinates;

    public ItineraryItem(){

    }

    public ItineraryItem(String name, String description){
        this.name=name;
        this.description= description;
        this.id=nextId;
        nextId++;
    }

    public ItineraryItem(String name, String description, String startDate, String startTime, String endDate, String endTime,
                         String type, String address, String latitude, String longitude,
                         String coordinates) {
        this.name = name;
        this.description= description;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.type = type;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.coordinates = coordinates;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItineraryItem itineraryItem = (ItineraryItem) o;
        return id == itineraryItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
