package com.example.controller;

import com.example.dto.EmployeeDto;
import com.example.service.EmployeeService;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping
    public ResponseEntity<List<EmployeeDto>> allEmployee()
    {
      return ResponseEntity.ok(employeeService.getAllemployee());
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(employeeService.createEmployee(employeeDto), HttpStatus.CREATED);
    }
}
