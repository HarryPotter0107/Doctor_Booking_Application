package com.SmartBridge.Health_Care.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vaccination_centers") // MongoDB collection
public class VaccinationCenter {
    @Id // Unique identifier
    private String id;
    private String name;
    private String location;
    private int capacity; // Number of appointments available

    public VaccinationCenter() {}

    // Constructor with name and location
    public VaccinationCenter(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters and Setters for accessing fields
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
