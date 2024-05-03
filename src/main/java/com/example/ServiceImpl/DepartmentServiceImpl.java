package com.example.ServiceImpl;

import java.util.List;

import com.example.Repository.DepartmentRepository;
import com.example.Service.DepartmentService;
import com.example.entity.Department;
import com.example.entity.Employee;

public class DepartmentServiceImpl implements DepartmentService{

	public DepartmentRepository departmentRespository;
	@SuppressWarnings("deprecation")
	@Override
	public Department getDepartmentById(int dId) {
		// TODO Auto-generated method stub
		return departmentRespository.getById(dId);
	}

	public DepartmentServiceImpl(DepartmentRepository departmentRespository) {
		this.departmentRespository = departmentRespository;
	}

	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return departmentRespository.findAll();
	}

	@Override
	public int addDepartment(Department department) {
		// TODO Auto-generated method stub
		if(departmentRespository.findById(department.getdId())==null)
		{
			departmentRespository.save(department);
			return 1;
		}
		return -1;
		
		
	}

	@Override
	public int updateDepartment(Department department) {
		// TODO Auto-generated method stub
		if(departmentRespository.findById(department.getdId())!=null)
		{
			
			return 1;
		}
		return -1;
		
	}

	@Override
	public int deleteDepartment(int dId) {
		// TODO Auto-generated method stub
		if(departmentRespository.findById(dId)!=null)
		{
			departmentRespository.deleteById(dId);
			return 1;
		}
		return -1;
		
	}

}
