package com.example.cema.model;

public class MedicalService {
    private String serviceName;
    private String description;

    // Default constructor (required for Firestore)
    public MedicalService() {}

    public MedicalService(String serviceName, String description) {
        this.serviceName = serviceName;
        this.description = description;
    }

    // Getter for serviceName
    public String getServiceName() {
        return serviceName;
    }

    // Setter for serviceName
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }
}
