package com.example.cema.model;

public class Medication {
    private String name;
    private String dosage;

    // Default constructor (required for Firestore)
    public Medication() {}

    public Medication(String name, String dosage) {
        this.name = name;
        this.dosage = dosage;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for dosage
    public String getDosage() {
        return dosage;
    }

    // Setter for dosage
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}