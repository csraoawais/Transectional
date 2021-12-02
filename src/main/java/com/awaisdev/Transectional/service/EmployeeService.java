package com.awaisdev.Transectional.service;

import com.awaisdev.Transectional.model.Department;
import com.awaisdev.Transectional.model.Employee;
import com.awaisdev.Transectional.repository.DepartmentRepo;
import com.awaisdev.Transectional.repository.EmployeeRepo;
import com.awaisdev.Transectional.view.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartmentRepo departmentRepo;
    @Transactional
    public String saveEmployee(EmployeeRequestVO employeeRequestVO) {

        Department department=new Department();
        department.setDepartmentName(employeeRequestVO.getDepartmentName());
        department.setDepartmentCode(employeeRequestVO.getDepartmentName());
        Long departmentId = departmentRepo.save(department)
                .getDepartmentId();
        Employee employee= null; /*Here we are passing null to crash our application. When we run application
        without @Transactional the department data will be saved but employee not, So this leads to be data
        inconsistency so we use @Transactional and transaction will be rollback. */
        employee.setEmpName(employeeRequestVO.getEmpName());
        employee.setEmail(employeeRequestVO.getEmail());
        employee.setDepartmentId(departmentId);
        employeeRepo.save(employee);
        return "Employee is saved with the ID " + employee.getEmployeeId();

    }
}
