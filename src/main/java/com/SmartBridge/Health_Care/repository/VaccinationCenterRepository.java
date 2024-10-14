package com.SmartBridge.Health_Care.repository;


import com.SmartBridge.Health_Care.model.VaccinationCenter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VaccinationCenterRepository extends MongoRepository<VaccinationCenter, String> {}

