package com.interswitch.services.service.impl;

import com.interswitch.services.model.Salary;
import com.interswitch.services.repository.SalaryRepository;
import com.interswitch.services.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalaryService implements ISalaryService {
    @Autowired
    SalaryRepository salaryRepository;
    public List<Salary> getSalariesNyEmployeeId(Long employeeId) {
        return salaryRepository.findByEmployeeId(employeeId);
    }
}
