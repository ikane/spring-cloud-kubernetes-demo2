package com.ikane.departmentservice.repository;

import com.ikane.departmentservice.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository  extends CrudRepository<Department, String> {
    List<Department> findByOrganizationId(Long organizationId);
}
