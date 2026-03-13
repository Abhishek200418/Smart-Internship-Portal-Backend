package com.example.InternshipPortal.Repository;

import com.example.InternshipPortal.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByEmail(String email);

}