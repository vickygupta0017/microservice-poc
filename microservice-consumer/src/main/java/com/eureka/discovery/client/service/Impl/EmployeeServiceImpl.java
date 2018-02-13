package com.eureka.discovery.client.service.Impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.eureka.discovery.client.bo.Employee;
import com.eureka.discovery.client.service.EmployeeService;
/**
 * 
 * @author gaugupta
 *
 */
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	RestTemplate restTemplate;
	
	String url;
	
	public EmployeeServiceImpl(String url) {
		this.url = url;
	}
	
	@Override
	public List<Employee> getEmployeeList() {
		Employee[] employeeList =  restTemplate.getForObject(url+"/employees", Employee[].class);
		return Arrays.asList(employeeList);
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		return restTemplate.getForObject(url+"/employees/{id}", Employee.class, id);
	}

}
