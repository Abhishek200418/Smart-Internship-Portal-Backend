package com.example.InternshipPortal.Controller;

import com.example.InternshipPortal.Model.Application;
import com.example.InternshipPortal.Service.ApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @PostMapping
    public void apply(@RequestBody Application application){
        service.Application(application);
    }

    @GetMapping("/student/{studentId}")
    public List<Application> StudentApplication(@PathVariable Long studentId){
        return service.StudentApplication(studentId);
    }

    @GetMapping("/internship/{internshipId}")
    public List<Application> getApplicants(@PathVariable Long internshipId){
        return service.getApplicants(internshipId);
    }

    @PutMapping
    public void updatedetails(@RequestBody Application application){
        service.updatedetails(application);
    }

    @DeleteMapping("/{id}")
    public void withdraw(@PathVariable Long id){
        service.withdraw(id);
    }
}