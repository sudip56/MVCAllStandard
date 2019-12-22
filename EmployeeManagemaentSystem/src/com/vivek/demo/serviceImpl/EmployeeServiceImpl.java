package com.vivek.demo.serviceImpl;

import com.vivek.demo.dao.EmployeeDAO;
import com.vivek.demo.daompl.EmployeeDAOImpl;
import com.vivek.demo.entity.Employee;
import com.vivek.demo.exception.InvalidEmployeeException;
import com.vivek.demo.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	//creating EmployeeDAO class obj..
	EmployeeDAO dao = null;
	@Override
	public Employee getEmployeeDetails(int id) throws InvalidEmployeeException{
		Employee lstEmployee = null;
		if(id !=0)
		{
			dao = new EmployeeDAOImpl();
			lstEmployee = dao.getEmployeeDetails(id);
			
		}
		return lstEmployee;
	}

}
