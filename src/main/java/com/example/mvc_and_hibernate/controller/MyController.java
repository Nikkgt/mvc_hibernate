package com.example.mvc_and_hibernate.controller;

import com.example.mvc_and_hibernate.entity.Employees;
import com.example.mvc_and_hibernate.dao.EmployeeDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    private final EmployeeDAO employeeDao;

    public MyController(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employees> allEmps = employeeDao.getEmps();
        model.addAttribute("allEmployees", allEmps);
        return "all-employees";
    }
}
