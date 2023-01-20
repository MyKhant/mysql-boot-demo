package com.example.mysqlbootdemo.controller;

import com.example.mysqlbootdemo.dao.EmployeeDao;
import com.example.mysqlbootdemo.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/creation")
    public String init(){
        List<Employee> list =
                List.of(
                        new Employee("John","Dow","john@gmail.com"),
                        new Employee("John","William","william@gmail.com"),
                        new Employee("Thomas","Hardy","hardy@gmail.com"),
                        new Employee("Charles","Dicken","charles@gmail.com")
                );
        list.forEach(employeeDao::save);
        return "success";
    }
    @GetMapping("/employees")
    public Iterable<Employee> listEmployee(){
        return employeeDao.findAll();
    }


}
