package com.hiton.employee.service;

import com.hiton.employee.entity.Employee;
import com.hiton.employee.exception.EmployeeException;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

      Employee addEmployee(Employee employee) throws EmployeeException;

      Employee getEmployeeById(Integer employeeId) throws EmployeeException;

      Page<Employee> getAllEmployees() throws EmployeeException;

      String deleteEmployeeById(Integer employeeId) throws EmployeeException;

      Employee updateEmployee(Integer employeeId,Employee employee) throws  EmployeeException;
}
