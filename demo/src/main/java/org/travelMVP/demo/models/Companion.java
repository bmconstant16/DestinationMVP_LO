package org.travelMVP.demo.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Companion {

    private int id;
    private static int nextId=1;

    @NotNull
    @NotBlank(message="You must enter a name.")
    private String name;

    private String relationship;

    public Companion(){
    }

    public Companion(String name, String relationship) {
        this.name = name;
        this.relationship = relationship;
        this.id=nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

}
