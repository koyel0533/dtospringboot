package com.example.service;

import com.example.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAllemployee();
    EmployeeDto createEmployee(EmployeeDto employeeDto);

}
