package com.hiton.employee.service;

import com.hiton.employee.entity.Employee;
import com.hiton.employee.exception.EmployeeException;
import com.hiton.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) throws EmployeeException {
        if (ObjectUtils.isEmpty(employee)) {
            throw new EmployeeException("Please provide valid all required employee details to register!");
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) throws EmployeeException {
        Optional<Employee> isEmployeeExist  = employeeRepository.findById(employeeId);
        if (isEmployeeExist.isEmpty()) {
            throw new EmployeeException("Employee with id:"+ employeeId + "does not exist");
        }
        return isEmployeeExist.get();
    }

    @Override
    public Page<Employee> getAllEmployees() throws EmployeeException {
        List<Employee> employeeList = employeeRepository.findAll();
        if (employeeList.isEmpty()) {
            throw new EmployeeException("Employee list is empty! please add a new employee ");
        }
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by("employeeId").ascending());
        return employeeRepository.findAll(pageRequest);
    }

    @Override
    public String deleteEmployeeById(Integer employeeId) throws EmployeeException {
        Optional<Employee> isEmployeeExist  = employeeRepository.findById(employeeId);
        if (isEmployeeExist.isEmpty()) {
            throw new EmployeeException("Employee with id:"+" "+ employeeId + " "+ "does not exist");
        }
        employeeRepository.deleteById(employeeId);
        return "Employee with id:"+" "+ employeeId + " "+"deleted Successfully";
    }

    @Override
    public Employee updateEmployee(Integer employeeId, Employee employee) throws EmployeeException {

        Optional<Employee> isEmployeeExist = employeeRepository.findById(employeeId);
        if (isEmployeeExist.isEmpty()) {
            throw new EmployeeException("customer with this id"+ employeeId +" "+"does not exist");
        }
        employee.setEmployeeId(employeeId);
        return employeeRepository.save(employee);
    }


}
