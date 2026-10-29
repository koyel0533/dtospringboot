package com.example.mapper;

import com.example.dto.EmployeeDto;
import com.example.entity.Employee;

public class Convertdto {

    public static EmployeeDto entity_dto(Employee employee)
    {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    public static Employee dto_entity(EmployeeDto employeedto)
    {
        return new Employee(
                employeedto.id(),
                employeedto.firstName(),
                employeedto.lastName(),
                employeedto.email()

        );
    }
}
