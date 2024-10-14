package com.SmartBridge.Health_Care.repository;

import com.SmartBridge.Health_Care.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {}
