package com.learn.springboot.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.springboot.entity.Employee;
import com.learn.springboot.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	private IEmployeeRepository employeeRespository;

	public EmployeeService(IEmployeeRepository employeeRespository) {
		this.employeeRespository = employeeRespository;
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {

		employeeRespository.deleteById(id);

	}

	public List<Employee> findByEmailOrName(String email, String name) {
		return employeeRespository.findByEmailOrName(email, name);
	}

	@Override
	public List<Employee> findByNameAndLevel(String name, int level) {

		return employeeRespository.findByNameAndLevel(name, level);
	}

	@Override
	public List<Employee> findByNameIs(String name) {

		return employeeRespository.findByNameIs(name);
	}

	@Override
	public List<Employee> findByNameEquals(String name) {

		return employeeRespository.findByNameEquals(name);
	}

	@Override
	public List<Employee> findByNameIsNot(String name) {

		return employeeRespository.findByNameIsNot(name);
	}

	@Override
	public List<Employee> findByNameStartsWith(String prefix) {

		return employeeRespository.findByNameStartsWith(prefix);
	}

	@Override
	public List<Employee> findByNameEndingWith(String suffix) {

		return employeeRespository.findByNameEndingWith(suffix);
	}

	@Override
	public List<Employee> findByNameIgnoreCase(String name) {

		return employeeRespository.findByNameIgnoreCase(name);
	}

	@Override
	public List<Employee> findByNameLike(String pattern) {

		return employeeRespository.findByNameLike(pattern);
	}

	@Override
	public List<Employee> findFirstByName(String name) {

		return employeeRespository.findFirstByName(name);
	}

	@Override
	public List<Employee> findFirstByNameOrderByLevel(String name) {

		return employeeRespository.findFirstByNameOrderByLevel(name);
	}

	@Override
	public List<Employee> findByEmailContaining(String name) {

		return employeeRespository.findByEmailContaining(name);
	}

	@Override
	public List<Employee> findFirstByOrderByEmail() {

		return employeeRespository.findFirstByOrderByEmail();
	}

	@Override
	public List<Employee> findByLevelLessThan(int level) {

		return employeeRespository.findByLevelLessThan(level);
	}

	@Override
	public List<Employee> findFirst2ByLevelOrderByBirthDateDesc(int level) {
		return employeeRespository.findFirst2ByLevelOrderByBirthDateDesc(level);

	}

	@Override
	public List<Employee> findByBirthDateBefore(LocalDate date) {

		return employeeRespository.findByBirthDateBefore(date);
	}

	@Override
	public List<Employee> findByNameOrderByEmail(String name) {

		return employeeRespository.findByNameOrderByEmail(name);
	}

	@Override
	public List<Employee> findByNameAndEmail(String name, String email) {

		return employeeRespository.findByNameAndEmail(name, email);
	}

	@Override
	public List<Employee> findByNameOrderByLevelAsc(String name, int level) {
		return employeeRespository.findByNameOrderByLevelAsc(name, level);
	}

	@Override
	public List<Employee> findByNameOrderByLevelAsc(String name) {
		return employeeRespository.findByNameOrderByLevelAsc(name);
	}

	public Integer updateNameOfEmployee(String name, int id) {
		return employeeRespository.updateNameOfEmployee(name, id);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRespository.findAll();
	}

	@Override
	public Integer deleteEmployById(int id) {
		
		return employeeRespository.deleteEmployById(id);
	}
}
