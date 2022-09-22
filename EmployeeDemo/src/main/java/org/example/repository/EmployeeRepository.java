package org.example.repository;

import org.example.model.Employee;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
