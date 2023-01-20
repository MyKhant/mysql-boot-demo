package com.example.mysqlbootdemo.dao;

import com.example.mysqlbootdemo.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
