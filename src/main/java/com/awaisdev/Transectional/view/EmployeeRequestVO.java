package com.awaisdev.Transectional.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//VO stands for View Object
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestVO {

    private String empName;
    private String email;
    private String departmentName;

}