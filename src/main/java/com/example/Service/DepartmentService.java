package com.example.Service;

import java.util.List;

import com.example.entity.Department;
import com.example.entity.Employee;

public interface DepartmentService {
		//Get Department By Id
		Department getDepartmentById(int dId);
		//Get ALL department-List of department
		List<Department> getAllDepartment();
		 //Create Department record
		int addDepartment(Department department);
		//Update record
		int updateDepartment(Department department);
		//Delete Record
		int deleteDepartment(int dId);	

}
