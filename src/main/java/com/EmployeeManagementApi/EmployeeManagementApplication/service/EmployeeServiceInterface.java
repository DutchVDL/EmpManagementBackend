package com.EmployeeManagementApi.EmployeeManagementApplication.service;

import com.EmployeeManagementApi.EmployeeManagementApplication.dto.EmployeeDTO;
import com.EmployeeManagementApi.EmployeeManagementApplication.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {

    Employee saveEmployee(EmployeeDTO employeeDTO);
    Optional<Employee> getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);

}
