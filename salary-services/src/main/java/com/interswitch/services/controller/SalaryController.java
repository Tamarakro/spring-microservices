package com.interswitch.services.controller;

import com.interswitch.services.model.Salary;
import com.interswitch.services.service.impl.SalaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SalaryController.class);
    @Autowired
    SalaryService salaryService;
    @GetMapping("/{employeeId}")
    public List <Salary> findByEmployeeId(@PathVariable("employeeId") Long employeeId){
        LOGGER.info("Salary find: employeeId={}", employeeId);
        return salaryService.getSalariesNyEmployeeId(employeeId);
    }

}
