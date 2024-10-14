package com.SmartBridge.Health_Care.service;

import com.SmartBridge.Health_Care.model.Doctor;
import com.SmartBridge.Health_Care.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // Add a new doctor
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // List all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Delete a doctor by ID
    public void deleteDoctor(String id) {
        doctorRepository.deleteById(id);
    }
}
