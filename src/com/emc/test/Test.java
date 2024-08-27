package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.entities.Venue;

public class Test {
    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.id=123;
        organizer.name ="suthan";
        System.out.println(organizer.id);
        System.out.println(organizer.name);
        Event event = new Event();
        event.id=43;
        event.name="birthday";
        event.description="birthday event";
        System.out.println(event.id);
        System.out.println(event.name);
        System.out.println(event.description);

        Venue venue = new Venue(32,"lakshmi hall","Birthday party event hall");
        System.out.println(venue.id);
        System.out.println(venue.name);
        System.out.println(venue.description);

    }
}

//line no 22 to 26 getting the data using constructor
