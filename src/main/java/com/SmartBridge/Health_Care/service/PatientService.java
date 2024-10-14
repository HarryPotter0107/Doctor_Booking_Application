package com.SmartBridge.Health_Care.service;

import com.SmartBridge.Health_Care.model.Patient;
import com.SmartBridge.Health_Care.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    // Register a new patient
    public Patient registerPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Get a patient by ID
    public Patient getPatientById(String id) {
        return patientRepository.findById(id).orElse(null);
    }

    // Update patient information (Optional, if required)
    public Patient updatePatient(String id, Patient updatedPatient) {
        Patient existingPatient = getPatientById(id);
        if (existingPatient != null) {
            existingPatient.setName(updatedPatient.getName());
            existingPatient.setEmail(updatedPatient.getEmail());
            existingPatient.setPhone(updatedPatient.getPhone());
            return patientRepository.save(existingPatient);
        }
        return null;
    }

    // Delete a patient
    public void deletePatient(String id) {
        patientRepository.deleteById(id);
    }
}
