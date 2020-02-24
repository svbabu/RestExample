package com.mkyong.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  enum EmployeeDao {

    instance;
     Map<String,Employee> map=new HashMap<String,Employee>();
    private  EmployeeDao()
    {
       Employee emp1=new Employee("101si","Veera","bangalore");
        Employee emp2=new Employee("102si","Sree","bangalore");
        map.put("1",emp1);
        map.put("2",emp2);
    }
    public Map<String,Employee > getEmployees()
    {

        return  map;
    }





}
