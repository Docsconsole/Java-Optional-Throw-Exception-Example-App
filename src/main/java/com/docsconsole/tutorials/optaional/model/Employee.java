package com.docsconsole.tutorials.optaional.model;


import com.docsconsole.tutorials.optaional.exception.EmployeeNotFoundException;

public class Employee extends Exception {

    private Integer id;
    private String name;

    public Employee getEmployee(Integer id) throws EmployeeNotFoundException {
        if (id != null) {
            return new Employee();
        }
        throw new EmployeeNotFoundException("Employee is not existed with given Id.");
    }
}