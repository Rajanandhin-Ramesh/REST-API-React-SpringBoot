package com.learnings.springboot.repository;


import com.learnings.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
        // all crud database methods

    }


