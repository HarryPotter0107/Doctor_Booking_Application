package com.SmartBridge.Health_Care.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doctors") // MongoDB collection
public class Doctor {
    @Id // Unique identifier
    private String id;
    private String name;
    private String specialization;
    private String centerId; // The Vaccination Center where the doctor works

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getCenterId() { return centerId; }
    public void setCenterId(String centerId) { this.centerId = centerId; }
}

