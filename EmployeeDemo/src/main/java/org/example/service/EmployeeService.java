package org.example.service;


import org.example.dto.EmployeeDTO;
import org.example.dto.Response;

public interface EmployeeService {

    Response addNewEmployee(EmployeeDTO employeeDto);
    Response updateEmployee(EmployeeDTO employeeDto);
    Response deleteEmployee(EmployeeDTO employeeDto);
}
