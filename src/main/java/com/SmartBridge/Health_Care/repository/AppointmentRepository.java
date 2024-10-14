package com.SmartBridge.Health_Care.repository;

import com.SmartBridge.Health_Care.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment,String> {
    List<Appointment> findByCenterId(String centerId);
}
