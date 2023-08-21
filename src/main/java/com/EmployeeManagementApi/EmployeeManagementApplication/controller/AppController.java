package com.EmployeeManagementApi.EmployeeManagementApplication.controller;

import com.EmployeeManagementApi.EmployeeManagementApplication.dto.EmployeeDTO;
import com.EmployeeManagementApi.EmployeeManagementApplication.model.Employee;
import com.EmployeeManagementApi.EmployeeManagementApplication.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@AllArgsConstructor
public class AppController {


    EmployeeService employeeService;


    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }


    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody EmployeeDTO employeeDTO){
       return employeeService.saveEmployee(employeeDTO);
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }


    @PutMapping ("/employee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO){
        return  employeeService.updateEmployee(id, employeeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

}
