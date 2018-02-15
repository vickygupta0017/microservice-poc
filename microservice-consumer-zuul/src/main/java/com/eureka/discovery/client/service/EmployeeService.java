package com.eureka.discovery.client.service;

import java.util.List;

import com.eureka.discovery.client.bo.Employee;
/**
 * 
 * @author gaugupta
 *
 */
public interface EmployeeService {

	public List<Employee> getEmployeeList();
	
	public Employee findEmployeeById(Integer id);
}
