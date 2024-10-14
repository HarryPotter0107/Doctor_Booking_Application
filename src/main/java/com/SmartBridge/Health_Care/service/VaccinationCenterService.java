package com.SmartBridge.Health_Care.service;

import com.SmartBridge.Health_Care.model.VaccinationCenter;
import com.SmartBridge.Health_Care.repository.VaccinationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationCenterService {

    @Autowired
    private VaccinationCenterRepository centerRepository;

    // Add a new vaccination center
    public VaccinationCenter addCenter(VaccinationCenter center) {
        return centerRepository.save(center);
    }

    // List all vaccination centers
    public List<VaccinationCenter> getAllCenters() {
        return centerRepository.findAll();
    }

    // Delete a vaccination center by ID
    public void deleteCenter(String id) {
        centerRepository.deleteById(id);
    }
}
