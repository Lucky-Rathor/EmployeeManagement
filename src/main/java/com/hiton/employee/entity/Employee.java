package com.hiton.employee.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "employee_details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @Column(name = "first_name")
    @NotNull(message = "Employee first name cannot be null or empty")
    @Pattern(regexp = "[A-Za-z ]*", message = "Special characters and digits are not allowed.")
    @Size(min = 3, max = 60)
    private String firstName;

    @Column(name = "last_name")
    @Size(max = 60)
    private String lastName;

    @Email
    @NotNull(message = "Email is mandatory for an employee")
    @Size(max = 180)
    private String email;


    @NotNull(message = "Department cannot be null ")
    @Size(max = 60)
    private String department;

    @NotNull(message = "Position can not be null")
    @Size(max = 60)
    private String position;

    private Double salary;
}
