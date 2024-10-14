package com.SmartBridge.Health_Care.controller;

import com.SmartBridge.Health_Care.model.Doctor;
import com.SmartBridge.Health_Care.model.VaccinationCenter;
import com.SmartBridge.Health_Care.service.DoctorService;
import com.SmartBridge.Health_Care.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private VaccinationCenterService vaccinationCenterService;

    @GetMapping("/dashboard")
    public String getAdminDashboard() {
        return "admin/admin-dashboard";
    }

    @GetMapping("/manage-doctors")
    public String getManageDoctorsPage(Model model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return "admin/manage-doctors";
    }

    @PostMapping("/doctors/add")
    public String addDoctor(@RequestParam String name, @RequestParam String specialization) {
        doctorService.addDoctor(new Doctor(name, specialization));
        return "redirect:/admin/manage-doctors";
    }

    @GetMapping("/doctors/delete/{id}")
    public String deleteDoctor(@PathVariable String id) {
        doctorService.deleteDoctor(id);
        return "redirect:/admin/manage-doctors";
    }

    @GetMapping("/manage-centers")
    public String getManageCentersPage(Model model) {
        model.addAttribute("centers", vaccinationCenterService.getAllCenters());
        return "admin/manage-centers";
    }

    @PostMapping("/centers/add")
    public String addCenter(@RequestParam String name, @RequestParam String location) {
        vaccinationCenterService.addCenter(new VaccinationCenter(name, location));
        return "redirect:/admin/manage-centers";
    }

    @GetMapping("/centers/delete/{id}")
    public String deleteCenter(@PathVariable String id) {
        vaccinationCenterService.deleteCenter(id);
        return "redirect:/admin/manage-centers";
    }
}
