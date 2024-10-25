package com.booleanuk.api;

import com.booleanuk.api.model.Employee;
import com.booleanuk.api.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class EmployeeTests {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee();
        employee.setName("Test Name");
        employee.setJobName("Test Job");
        employee.setSalaryGrade("Test Grade");
        employee.setDepartment("Test Department");

        Employee savedEmployee = employeeRepository.save(employee);
        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isNotNull();
    }
}
