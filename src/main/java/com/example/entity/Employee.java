package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table(name="koyelemp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public Employee(String firstName,String lastName,String email) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.email=email;
    }
}
