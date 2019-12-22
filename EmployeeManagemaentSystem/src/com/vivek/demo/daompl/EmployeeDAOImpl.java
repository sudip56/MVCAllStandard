package com.vivek.demo.daompl;

import java.util.Arrays;
import java.util.List;

import com.vivek.demo.dao.EmployeeDAO;
import com.vivek.demo.entity.Employee;
import com.vivek.demo.exception.InvalidEmployeeException;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public Employee getEmployeeDetails(int id) throws InvalidEmployeeException {
		List<Employee> lstEmployee = Arrays.asList(
				new Employee(1001, "Vivek Sukla", "Navi Mumbai", "Male", "Hadoop", 45000.56d),
				new Employee(1002, "Sudip Banerjee", "Navi Mumbai", "Male", "Java", 45000.56d),
				new Employee(1003, "Mukesh sav", "Navi Mumbai", "Male", "sales", 55000.56d),
				new Employee(1004, "jones", "USA", "Male", "RPA", 75000.56d));

		return lstEmployee.stream()
						  .filter(emp -> emp.getEmployeeId() == id)
						  .findAny()
				          .orElseThrow(() -> new InvalidEmployeeException("No user found with userID " + id));
	}
}
