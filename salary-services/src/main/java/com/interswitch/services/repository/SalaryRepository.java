package com.interswitch.services.repository;

import com.interswitch.services.model.Salary;

import java.util.ArrayList;
import java.util.List;

public class SalaryRepository {
    private List<Salary> salaries = new ArrayList<>();

    public void  add(Salary salary){
        salaries.add(salary);
//        return salary;
    }
    public List<Salary> findByEmployeeId(Long employeeId){
        return salaries.stream().filter(a -> a.getEmployeeId().equals(employeeId)).toList();
    }
}
