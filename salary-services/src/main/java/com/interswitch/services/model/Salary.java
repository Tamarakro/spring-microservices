package com.interswitch.services.model;

import java.time.LocalDate;

public class Salary {
    private Long employeeId;
    private Double amount;
    private LocalDate date;
    private Long departmentId;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Salary(Long employeeId, Double amount, LocalDate date, Long departmentId) {
        this.employeeId = employeeId;
        this.amount = amount;
        this.date = date;
        this.departmentId = departmentId;
    }
}
