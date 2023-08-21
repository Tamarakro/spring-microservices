package com.interswitch.services.service;

import com.interswitch.services.model.Salary;

import java.util.List;

public interface ISalaryService {
    public List<Salary> getSalariesNyEmployeeId(Long employeeId);
}
