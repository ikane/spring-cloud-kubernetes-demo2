package com.ikane.departmentservice.client;

import com.ikane.departmentservice.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employee")
public interface EmployeeClient {
    @GetMapping("/department/{departmentId}")
    List<Employee> findByDepartment(@PathVariable("departmentId") String departmentId);
}
