package com.example.ems.service;

import com.example.ems.exception.ResourceNotFoundException;
import com.example.ems.model.Department;
import com.example.ems.model.Employee;
import com.example.ems.repository.DepartmentRepository;
import com.example.ems.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    @Transactional
    public Employee createEmployee(Employee employee, Long departmentId) {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found"));
        employee.setDepartment(department);
        return employeeRepository.save(employee);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Transactional
    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
        employee.setName(employeeDetails.getName());
        employee.setEmail(employeeDetails.getEmail());
        return employeeRepository.save(employee);
    }

    @Transactional
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Employee> searchEmployees(String keyword) {
        return employeeRepository.searchByName(keyword);
    }

    @Transactional
    public void batchInsertEmployees(List<Employee> employees, Long departmentId) {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found"));

        employees.forEach(employee -> {
            employee.setDepartment(department);
            employeeRepository.save(employee);
        });
    }
}