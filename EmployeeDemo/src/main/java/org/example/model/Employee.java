package org.example.model;


import org.springframework.data.annotation.Id;

public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long employeeId;

    String fullName;

    String title;

    Department department;

}
