package com.example.InternshipPortal.Service;

import com.example.InternshipPortal.Model.Internship;
import com.example.InternshipPortal.Repository.InternshipRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {

    @Autowired
    private InternshipRepository repo;

    public void addinternship(Internship internship){
        repo.save(internship);
    }

    public List<Internship> getAllinternships(){
        return repo.findAll();
    }

    public List<Internship> search(String keyword){
        return repo.findByTitleContainingIgnoreCase(keyword);
    }

    public Internship getinternship(int id){
        return repo.findById(id).orElse(null);
    }

    public void updatejob(Internship internship){
        repo.save(internship);
    }

    public void deletevoid(int id){
        repo.deleteById(id);
    }
}