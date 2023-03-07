package com.example.demoWebApp;

import java.util.ArrayList;

import antlr.collections.List;

public class EmployeeService implements IEmployeeService {
	EmployeeRespository employeeRes;

	@Override
	public List getEmployees() {
		java.util.List<Employee> employeeList = new ArrayList<Employee>();
		employeeRes.findAll().forEach(e -> employeeList.add(e));
		return (List) employeeList;
	}

	@Override
	public Employee getEmployeeById(Long EmployeeId) {
		return employeeRes.findById(EmployeeId).get();

	}

	@Override
	public void saveOrUpdateEmployee(Employee employee) {
		employeeRes.save(employee);

	}

	@Override
	public void UpdateEmployee(Employee employee) {
		employeeRes.save(employee);
	}

	@Override
	public void deleteEmployee(Long EmloyeeId) {
		employeeRes.deleteById(EmloyeeId);

	}

}
