package net.atdevservices.springboot.repository;

import net.atdevservices.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    //all CRUD database methods
}
