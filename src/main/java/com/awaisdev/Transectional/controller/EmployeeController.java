package com.awaisdev.Transectional.controller;

import com.awaisdev.Transectional.service.EmployeeService;
import com.awaisdev.Transectional.view.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public String saveEmployee(@RequestBody EmployeeRequestVO employeeRequestVO)
    {
        return employeeService.saveEmployee(employeeRequestVO);
    }
}
