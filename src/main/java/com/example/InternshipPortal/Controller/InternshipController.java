package com.example.InternshipPortal.Controller;

import com.example.InternshipPortal.Model.Internship;
import com.example.InternshipPortal.Service.InternshipService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://smart-internship-portal-frontend.onrender.com")
@RequestMapping("/internships")
public class InternshipController {

    @Autowired
    private InternshipService service;

    @PostMapping
    public void addinternship(@RequestBody Internship internship){
        service.addinternship(internship);
    }

    @GetMapping
    public List<Internship> getAllinternships(){
        return service.getAllinternships();
    }

    @GetMapping("/search")
    public List<Internship> search(@RequestParam String keyword){
        return service.search(keyword);
    }

    @GetMapping("/{id}")
    public Internship getinternship(@PathVariable int id){
        return service.getinternship(id);
    }

    @PutMapping
    public void updatejob(@RequestBody Internship internship){
        service.updatejob(internship);
    }

    @DeleteMapping("/{id}")
    public void deletevoid(@PathVariable int id){
        service.deletevoid(id);
    }
}