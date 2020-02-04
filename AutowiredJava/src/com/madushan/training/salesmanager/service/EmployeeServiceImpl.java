package com.madushan.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madushan.training.salesmanager.model.Employee;
import com.madushan.training.salesmanager.repository.EmployeeRepository;
import com.madushan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	//EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository2) {
		System.out.println("Overloaded constractor executed");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeServiceImpl() {
		System.out.println("Default constractor executed");
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter Executed");
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}
	

}
