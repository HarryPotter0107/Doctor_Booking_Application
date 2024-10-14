package com.SmartBridge.Health_Care.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "appointments") // MongoDB collection
public class Appointment {
    @Id // Unique identifier
    private String id;
    private String doctorId;
    private String patientId;
    private String centerId;
    private LocalDate date; // Appointment date

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getCenterId() { return centerId; }
    public void setCenterId(String centerId) { this.centerId = centerId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}

