package com.emc.entities;

public class Venue extends EmcBase{
    public String description;
    public String address;
    public String city;
    public String state;
    public String country;
    public String zip;

    public Venue(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;


    }

}
