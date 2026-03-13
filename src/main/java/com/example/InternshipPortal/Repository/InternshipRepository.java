package com.example.InternshipPortal.Repository;

import com.example.InternshipPortal.Model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InternshipRepository extends JpaRepository<Internship, Integer> {

    List<Internship> findByTitleContainingIgnoreCase(String keyword);

}