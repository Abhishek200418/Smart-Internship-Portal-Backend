package com.example.InternshipPortal.Controller;

import com.example.InternshipPortal.Model.User;
import com.example.InternshipPortal.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://smart-internship-portal-frontend.onrender.com")
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/users/register")
    public User addStudent(@RequestBody User user){
        return service.addStudent(user);
    }

    @PostMapping("/company/register")
    public User registerCompany(@RequestBody User user){
        return service.registerCompany(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user){

        return service.login(user.getEmail(), user.getPassword());
    }
}