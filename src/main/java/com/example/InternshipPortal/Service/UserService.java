package com.example.InternshipPortal.Service;

import com.example.InternshipPortal.Model.User;
import com.example.InternshipPortal.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User addStudent(User user){

        user.setRole("STUDENT");

        return repo.save(user);
    }

    public User registerCompany(User user){

        user.setRole("COMPANY");

        return repo.save(user);
    }

    public User login(String email,String password){

        User user = repo.findByEmail(email);

        if(user != null && user.getPassword().equals(password)){
            return user;
        }

        return null;
    }
}