package com.example.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Service.DepartmentService;
import com.example.entity.Department;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	public	DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	@PostMapping
	public ResponseEntity<Integer> createDepartment(@RequestBody Department department){
		return new ResponseEntity(departmentService.addDepartment(department), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> getDeptById(@PathVariable Integer dId){
		Department department=departmentService.getDepartmentById(dId);
		return ResponseEntity.ok(department);
	}
	
	@GetMapping("/GetAllDept")
	public ResponseEntity<List<Department>> getAllDept(){
		List <Department> department=departmentService.getAllDepartment();
		return ResponseEntity.ok(department);
	}
	@PutMapping
	public ResponseEntity<Integer> updateDept(@RequestBody Department department){
		//Department department;
		int retValue=departmentService.updateDepartment(department);
		return ResponseEntity.ok(retValue);
		
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> deleteDept(@PathVariable Integer dId){
		int retvalue=departmentService.deleteDepartment(dId);
		return ResponseEntity.ok(retvalue);
	}
	

	


}
