package com.example.ems.repository;

import com.example.ems.model.Employee;
import com.example.ems.projection.EmployeeNameProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Derived queries
    List<Employee> findByNameContaining(String name);
    List<Employee> findByDepartmentName(String departmentName);
    List<Employee> findByEmailEndingWith(String domain);

    // JPQL queries
    @Query("SELECT e FROM Employee e WHERE e.department.name = :deptName")
    List<Employee> findByDepartmentNameCustom(@Param("deptName") String deptName);

    // Native query
    @Query(value = "SELECT * FROM employees WHERE name LIKE %:keyword%", nativeQuery = true)
    List<Employee> searchByName(@Param("keyword") String keyword);

    // Pagination
    Page<Employee> findAll(Pageable pageable);
    Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);

    // Projection
    List<EmployeeNameProjection> findProjectedByNameContaining(String name);
}