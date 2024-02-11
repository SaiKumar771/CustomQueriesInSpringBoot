package com.learn.springboot.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.learn.springboot.entity.Employee;

public interface IEmployeeService {

	public Employee saveEmployee(Employee employee);

	public void deleteEmployee(int id);

	public List<Employee> getAllEmployees();

	public List<Employee> findByEmailOrName(String email, String name);

	public List<Employee> findByNameAndLevel(String name, int level);

	public List<Employee> findByNameIs(String name);

	public List<Employee> findByNameEquals(String name);

	public List<Employee> findByNameIsNot(String name);

	// below functions are example of patterns that is going to pick up by spring
	// ioc by using our entity attributes defined in entity class

	public List<Employee> findByNameStartsWith(String prefix);

	public List<Employee> findByNameEndingWith(String suffix);

	public List<Employee> findByNameIgnoreCase(String name);

	public List<Employee> findByNameLike(String pattern);

	public List<Employee> findFirstByName(String name);

	public List<Employee> findFirstByNameOrderByLevel(String name);

	public List<Employee> findByEmailContaining(String name);

	public List<Employee> findFirstByOrderByEmail();

	public List<Employee> findByLevelLessThan(int level);

	public List<Employee> findFirst2ByLevelOrderByBirthDateDesc(int level);

	public List<Employee> findByBirthDateBefore(LocalDate date);

	public List<Employee> findByNameOrderByEmail(String name);

	public List<Employee> findByNameAndEmail(String name, String email);

	public List<Employee> findByNameOrderByLevelAsc(String name, int level);

	public List<Employee> findByNameOrderByLevelAsc(String name);

	public Integer updateNameOfEmployee(String name, int id);
	
	public Integer deleteEmployById(@Param("id") int id);
}
