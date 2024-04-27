package com.hiton.employee.controller;


import com.hiton.employee.entity.Employee;
import com.hiton.employee.exception.EmployeeException;
import com.hiton.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/v1/employee")
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) throws EmployeeException {
        return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping(value = "v1/employee/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Integer employeeId) throws EmployeeException {
        return new ResponseEntity<>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
    }

    @GetMapping(value = "v1/employees")
    public ResponseEntity<Page<Employee>> getAllEmployees() throws EmployeeException {
        return new ResponseEntity<>(employeeService.getAllEmployees(),HttpStatus.OK);
    }

    @PutMapping(value = "v1/employee/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("employeeId") Integer employeeId, @RequestBody Employee employee) throws EmployeeException {
        return new ResponseEntity<>(employeeService.updateEmployee(employeeId,employee),HttpStatus.OK);
    }

    @DeleteMapping(value = "v1/employee/{employeeId}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable("employeeId") Integer employeeId) throws EmployeeException {
        return new ResponseEntity<>(employeeService.deleteEmployeeById(employeeId),HttpStatus.OK);
    }
}
