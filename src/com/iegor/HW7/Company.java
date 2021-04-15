package com.iegor.HW7;

import java.math.BigDecimal;

public class Company {
    private Employee [] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Company() {
        this.employees = new Employee[3];
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        if (companyBonus == null || companyBonus.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException();
        }
        else for (Employee employee: this.employees) {
            employee.setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay(){
        BigDecimal salary = new BigDecimal(0);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) break;
            salary = salary.add(employees[i].toPay());
        }
        return salary;
    }

    public String nameMaxSalary(){
        BigDecimal salaryMax = this.employees[0].toPay();
        String employeeMaxSalaryName = this.employees[0].getLastName();
        for (int i = 0; i < employees.length; i++) {
            if (salaryMax.compareTo(this.employees[i].toPay())<0){
                salaryMax = employees[i].toPay();
                employeeMaxSalaryName = employees[i].getLastName();
            }
        }
        return employeeMaxSalaryName;
    }
}

