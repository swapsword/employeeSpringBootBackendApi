package com.api.employeeSpringBootBackendApi.repositories;

import com.api.employeeSpringBootBackendApi.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
