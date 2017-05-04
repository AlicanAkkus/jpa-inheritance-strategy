package com.caysever.repository;

import com.caysever.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by alican on 04.05.2017.
 */
@RepositoryRestResource(path = "employee")
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
