package com.example.demoWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeSer;

	@GetMapping("/employees")
	antlr.collections.List getEmployees() {
		return employeeSer.getEmployees();

	}

	@GetMapping("/employee/{idEmployee}")
	Employee getEmployee(@PathVariable Long idEmployee) {
		return employeeSer.getEmployeeById(idEmployee);
	}

	@PutMapping("/employee")
	void updateEmployee(@RequestBody Employee employee) {
		employeeSer.UpdateEmployee(employee);
	}

	@DeleteMapping("/employee/{idEmployee}")
	void deleteEmployee(@PathVariable Long idEmployee) {
		employeeSer.deleteEmployee(idEmployee);
	}

	@PostMapping("/employee")
	void addEmployee(@RequestBody Employee employee) {
		employeeSer.saveOrUpdateEmployee(employee);
	}
}
