package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {


    EmployeeDao employeeDao;

    public EmployeeService() {
        employeeDao = EmployeeDao.instance;

    }

    public void createEmployee(Employee e) {
        employeeDao.getEmployees().put(e.getId(), e);
    }

    public Employee getEmployee(String id) {

        return employeeDao.getEmployees().get(id);
    }
    public List<Employee> getAllEmployees()
    {
        List<Employee> list= new ArrayList<Employee>();
        list.addAll(employeeDao.getEmployees().values());
        return list;
    }
    public int countEmployees()
    {
        return  employeeDao.getEmployees().size();
    }
     public void deleteEmployee(String id)
     {
         employeeDao.getEmployees().remove(id);
     }

}

