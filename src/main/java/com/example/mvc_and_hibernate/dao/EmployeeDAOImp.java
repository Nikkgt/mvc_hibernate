package com.example.mvc_and_hibernate.dao;

import com.example.mvc_and_hibernate.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;
@Repository
public class EmployeeDAOImp implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    @Transactional
    public List<Employees> getEmps() {
        Session session = sessionFactory.getCurrentSession();
        Query<Employees> query = session.createQuery("from Employees", Employees.class);
        List<Employees> employeesList = query.getResultList();

        return employeesList;
    }
}
