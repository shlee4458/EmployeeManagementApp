package com.yish.employeeManagement.dao;

import com.yish.employeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Order employees by ascending last name
    List<Employee> findAllByOrderByLastNameAsc();
}
