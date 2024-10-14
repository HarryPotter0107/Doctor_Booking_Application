package com.SmartBridge.Health_Care.repository;


import com.SmartBridge.Health_Care.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {}

