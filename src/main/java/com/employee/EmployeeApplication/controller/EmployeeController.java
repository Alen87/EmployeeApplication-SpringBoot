package com.employee.EmployeeApplication.controller;


import com.employee.EmployeeApplication.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
// @RestController  // isto znacenje, kombinacija  @Controller + @ResponseBody
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> findAllEmployees() {

         List<Employee> employeeList = Arrays.asList(
                new Employee(1, "First Employee", "Washington"),
                new Employee(2, "Second Employee", "New York")
        );
        return employeeList;

    }


}
