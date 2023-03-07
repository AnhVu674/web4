package com.example.demoWebApp;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRespository extends CrudRepository<Employee, Long> {

}
