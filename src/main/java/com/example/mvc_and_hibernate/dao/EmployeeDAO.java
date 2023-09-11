package com.example.mvc_and_hibernate.dao;

import com.example.mvc_and_hibernate.entity.Employees;

import java.util.List;

public interface EmployeeDAO {
    public List<Employees> getEmps();
}
