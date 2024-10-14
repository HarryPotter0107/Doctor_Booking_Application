package com.SmartBridge.Health_Care.controller;

import com.SmartBridge.Health_Care.model.Appointment;
import com.SmartBridge.Health_Care.model.Patient;
import com.SmartBridge.Health_Care.service.AppointmentService;
import com.SmartBridge.Health_Care.service.DoctorService;
import com.SmartBridge.Health_Care.service.PatientService;
import com.SmartBridge.Health_Care.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private VaccinationCenterService vaccinationCenterService;

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/dashboard")
    public String getPatientDashboard() {
        return "patient/patient-dashboard";
    }

    @GetMapping("/book-appointment")
    public String getBookAppointmentPage(Model model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        model.addAttribute("centers", vaccinationCenterService.getAllCenters());
        return "patient/book-appointment";
    }

    @PostMapping("/book-appointment")
    public String bookAppointment(@RequestParam String doctorId, @RequestParam String centerId, @RequestParam LocalDate appointmentDate) {
        appointmentService.bookAppointment(doctorId, centerId, appointmentDate);
        return "redirect:/patient/view-appointments";
    }

    @GetMapping("/view-appointments")
    public String viewAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAllAppointments());
        return "patient/view-appointments";
    }

    @GetMapping("/appointments/cancel/{id}")
    public String cancelAppointment(@PathVariable String id) {
        appointmentService.cancelAppointment(id);
        return "redirect:/patient/view-appointments";
    }
}
