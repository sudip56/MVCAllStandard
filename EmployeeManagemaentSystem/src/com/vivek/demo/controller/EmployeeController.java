package com.vivek.demo.controller;

import com.vivek.demo.entity.Employee;
import com.vivek.demo.exception.InvalidEmployeeException;
import com.vivek.demo.service.EmployeeService;
import com.vivek.demo.serviceImpl.EmployeeServiceImpl;

public class EmployeeController {

	// creating service class object..
	EmployeeService service = null;

	public void getEmployeeDetailsById(int id) {

		if (id != 0) {
			service = new EmployeeServiceImpl();
			Employee lstEmployee = null;
			try {
				lstEmployee = service.getEmployeeDetails(id);
			} catch (InvalidEmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("The Employee with id" + id + " having details is:::::" + lstEmployee.toString());
		}

	}

}