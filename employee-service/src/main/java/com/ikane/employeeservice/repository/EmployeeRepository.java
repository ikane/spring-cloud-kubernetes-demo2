package com.ikane.employeeservice.repository;

import com.ikane.employeeservice.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository  extends CrudRepository<Employee, String> {
    List<Employee> findByDepartmentId(Long departmentId);
    List<Employee> findByOrganizationId(Long organizationId);
}
