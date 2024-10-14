package com.SmartBridge.Health_Care.service;

import com.SmartBridge.Health_Care.model.Appointment;
import com.SmartBridge.Health_Care.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // Book an appointment (Updated to take doctorId, centerId, and date)
    public Appointment bookAppointment(String doctorId, String centerId, LocalDate appointmentDate) {
        Appointment appointment = new Appointment();
        appointment.setDoctorId(doctorId);
        appointment.setCenterId(centerId);
        appointment.setDate(appointmentDate); // Directly set the date as a String
        return appointmentRepository.save(appointment);
    }


    // Get all appointments
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    // Get appointments for a particular center
    public List<Appointment> getAppointmentsByCenter(String centerId) {
        return appointmentRepository.findByCenterId(centerId);
    }

    // Cancel an appointment
    public void cancelAppointment(String id) {
        appointmentRepository.deleteById(id);
    }
}
