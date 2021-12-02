package com.awaisdev.Transectional.repository;

import com.awaisdev.Transectional.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {


        }
