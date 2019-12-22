package com.vivek.demo.app;

import java.util.Scanner;

import com.vivek.demo.controller.EmployeeController;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//creating EmployeeController object....
		EmployeeController employeeController = new EmployeeController();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a employee id::");
		int id = scan.nextInt();
		
		employeeController.getEmployeeDetailsById(id);

	}

}
