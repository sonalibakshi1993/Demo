package org.example.controller;

import org.example.dto.EmployeeDTO;
import org.example.dto.Response;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeeDemo/api/v1")
public class EmployeeDemoController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Response addNewEmployee(@RequestBody(required = true)EmployeeDTO employeeDto) {
        return employeeService.addNewEmployee(employeeDto);
    }

    @PutMapping("/updateEmployee")
    public Response updateEmployee(@RequestBody(required = true)EmployeeDTO employeeDto) {
        return employeeService.updateEmployee(employeeDto);
    }

    @DeleteMapping("/deleteEmployee")
    public Response deleteEmployee(@RequestBody(required = true) EmployeeDTO employeeDto) {
       return employeeService.deleteEmployee(employeeDto);
    }

}
