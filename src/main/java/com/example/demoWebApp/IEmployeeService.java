package com.example.demoWebApp;

import antlr.collections.List;

public interface IEmployeeService {
	List getEmployees();

	Employee getEmployeeById(Long EmployeeId);

	void saveOrUpdateEmployee(Employee employee);

	void UpdateEmployee(Employee employee);

	void deleteEmployee(Long EmloyeeId);
}
