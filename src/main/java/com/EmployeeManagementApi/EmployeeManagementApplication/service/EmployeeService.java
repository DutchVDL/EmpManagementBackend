package com.EmployeeManagementApi.EmployeeManagementApplication.service;

import com.EmployeeManagementApi.EmployeeManagementApplication.dto.EmployeeDTO;
import com.EmployeeManagementApi.EmployeeManagementApplication.model.Employee;
import com.EmployeeManagementApi.EmployeeManagementApplication.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService implements EmployeeServiceInterface{



    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee();
        employee.setEmail(employeeDTO.getEmail());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());

        employeeRepository.save(employee);

        return employee;
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
       return employeeRepository.findById(id);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        employee.setEmail(employeeDTO.getEmail());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employeeRepository.save(employee);


        return employee;
    }

    @Override
    public void deleteEmployee(Long id) {


        employeeRepository.deleteById(id);
    }
}
