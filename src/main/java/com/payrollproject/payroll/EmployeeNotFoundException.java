package com.payrollproject.payroll;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Employee introuvable " + id);
    }
}
