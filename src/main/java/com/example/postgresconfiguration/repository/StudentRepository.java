package com.example.postgresconfiguration.repository;

import com.example.postgresconfiguration.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,Long> {
     Students findByLastName(String lastName);

}
