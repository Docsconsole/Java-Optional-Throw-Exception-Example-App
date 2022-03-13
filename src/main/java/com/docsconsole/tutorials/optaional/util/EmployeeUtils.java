package com.docsconsole.tutorials.optaional.util;


import com.docsconsole.tutorials.optaional.exception.EmployeeNotFoundException;
import com.docsconsole.tutorials.optaional.model.Employee;

import java.util.Optional;

public class EmployeeUtils {

    public Employee getEmployeeByName(String name) throws Exception {
        Employee employee = null;
        if (!name.isEmpty()) {
            employee = new Employee();
        }
        return Optional.ofNullable(employee)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee is not existed with given Name."));
    }

    public Employee getEmployeeById(Integer id) throws Exception {
        Employee employee = null;
        if (id != null) {
            employee = new Employee();
        }
        return Optional.ofNullable(employee)
                .orElseThrow(() -> new NullPointerException("Employee is not existed with given Id."));
    }
}
