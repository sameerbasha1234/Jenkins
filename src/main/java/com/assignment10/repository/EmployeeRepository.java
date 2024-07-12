package com.assignment10.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment10.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	
}
