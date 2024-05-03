package com.example.Service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {
	//Get Employee By Id
	Employee getEmployeeById(int eId);
	//Get ALL employee-List of employee
	List<Employee> getAllEmployees();
	 //Create employee record
	int addEmployee(Employee employee);
	//Update record
	int updateEmployee(Employee employee);
	//Delete Record
	int deleteEmployee(int eId);	

}
