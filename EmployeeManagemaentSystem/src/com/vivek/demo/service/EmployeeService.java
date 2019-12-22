package com.vivek.demo.service;

import com.vivek.demo.entity.Employee;
import com.vivek.demo.exception.InvalidEmployeeException;

public interface EmployeeService {

	public Employee getEmployeeDetails(int id) throws InvalidEmployeeException;
}
