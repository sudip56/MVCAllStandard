package com.vivek.demo.dao;

import com.vivek.demo.entity.Employee;
import com.vivek.demo.exception.InvalidEmployeeException;

public interface EmployeeDAO {

	public Employee getEmployeeDetails(int id) throws InvalidEmployeeException;
}
