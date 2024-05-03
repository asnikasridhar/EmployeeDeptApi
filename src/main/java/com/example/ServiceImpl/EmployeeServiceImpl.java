package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepository;
import com.example.Service.EmployeeService;
import com.example.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee getEmployeeById(int eId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(eId).orElse(null);
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employeeRepository.findById(employee.geteId()) == null)
		{
			employeeRepository.save(employee);
			return 1;
		}
		return -1;
		
		
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employeeRepository.findById(employee.geteId()) != null)
		{
			Employee emp = employeeRepository.findById(employee.geteId()).orElse(null);
			emp.seteName(employee.geteName());
			emp.seteId(employee.geteId());
			emp.setdept(employee.getdept());	
			employeeRepository.save(emp);
			return 1;
		}
		return -1;
		
	}

	@Override
	public int deleteEmployee(int eId) {
		// TODO Auto-generated method stub
		if(employeeRepository.findById(eId) != null)
		{
			employeeRepository.deleteById(eId);
			return 1;
		}
		else
			return -1;
		
	}

}
