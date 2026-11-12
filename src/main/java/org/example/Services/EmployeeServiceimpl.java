package org.example.Services;

import org.example.Model.EmployeeDTO;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl {

    public void createEmployee(EmployeeDTO employeeDTO){
        System.out.println(employeeDTO);
    }
}
