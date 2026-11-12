package org.example.Controller;

import org.example.Model.EmployeeDTO;
import org.example.Services.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceimpl service;

    @PostMapping("/create/employee")
    public void createEmployee(@RequestBody EmployeeDTO employeeDTO){
        service.createEmployee(employeeDTO);

    }
}
