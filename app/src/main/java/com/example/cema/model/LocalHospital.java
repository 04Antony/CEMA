package com.example.cema.model;

public class LocalHospital {
    private String name;
    private String location;

    // Default constructor (required for Firestore)
    public LocalHospital() {}

    public LocalHospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }
}
