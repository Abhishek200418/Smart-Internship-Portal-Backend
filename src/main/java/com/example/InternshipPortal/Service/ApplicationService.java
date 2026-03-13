package com.example.InternshipPortal.Service;

import com.example.InternshipPortal.Model.Application;
import com.example.InternshipPortal.Repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repo;

    public void Application(Application application){
        repo.save(application);
    }

    public List<Application> StudentApplication(Long studentId){
        return repo.findByStudentId(studentId);
    }

    public List<Application> getApplicants(Long internshipId){
        return repo.findByInternshipId(internshipId);
    }

    public void updatedetails(Application application){
        repo.save(application);
    }

    public void withdraw(Long id){
        repo.deleteById(id);
    }
}