package com.example.service.impl;

import com.example.dto.EmployeeDto;
import com.example.entity.Employee;
import com.example.mapper.Convertdto;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDto> getAllemployee() {
        return employeeRepository.findAll().stream()
                .map(Convertdto::entity_dto)
                .toList();
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee tobesave = employeeRepository.save(Convertdto.dto_entity(employeeDto));
        return Convertdto.entity_dto(tobesave);


    }
}
