package com.example;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor

public class DtospringbootApplication implements CommandLineRunner {
   private final EmployeeRepository employeeRepository;
    public static void main(String[] args) {
        SpringApplication.run(DtospringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee>  dummy=
                List.of(new Employee("A","b","a@gmail.com"),
                        new Employee("B","c","b@gmail.com"),
                        new Employee("C","d","c@gmail.com")

                        );
        employeeRepository.saveAll(dummy);
        System.out.println("--------saved all--------------");
    }
}
