package com.learn.springboot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.entity.Employee;
import com.learn.springboot.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeController {

	private IEmployeeService employeeService;

	public EmployeeController(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping("/emp")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("emp/all")
	public List<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		log.info("employee deleted");
		employeeService.deleteEmployee(id);
	}

	@GetMapping("/employ/{email}/{name}")
	public List<Employee> findByEmailOrName(@PathVariable("email") String email, @PathVariable("name") String name) {
		log.info("find employee by email or name");
		return employeeService.findByEmailOrName(email, name);
	}

	@GetMapping("/emp/and/{name}/{level}")
	public List<Employee> findByNameAndLevel(@PathVariable("name") String name, @PathVariable("level") int level) {
		log.info("find employee by name and level");
		return employeeService.findByNameAndLevel(name, level);
	}

	@GetMapping("emp/is/{name}")
	public List<Employee> findByNameIs(@PathVariable("name") String name) {
		log.info("find employee by name is");
		return employeeService.findByNameIs(name);
	}

	@GetMapping("emp/equals/{name}")
	public List<Employee> findByNameEquals(@PathVariable("name") String name) {
		log.info("find employee by email equals");
		return employeeService.findByNameEquals(name);
	}

	@GetMapping("emp/is/not/{name}")
	public List<Employee> findByNameIsNot(@PathVariable("name") String name) {
		log.info("find employee by email name " + 5 / 2);
		return employeeService.findByNameIsNot(name);
	}

	@GetMapping("emp/start/{prefix}")
	public List<Employee> findByNameStartsWith(@PathVariable("prefix") String prefix) {

		return employeeService.findByNameStartsWith(prefix);
	}

	@GetMapping("emp/end/{suffix}")
	public List<Employee> findByNameEndingWith(@PathVariable("suffix") String suffix) {

		return employeeService.findByNameEndingWith(suffix);
	}

	@GetMapping("emp/Ignore/{name}")
	public List<Employee> findByNameIgnoreCase(@PathVariable("name") String name) {

		return employeeService.findByNameIgnoreCase(name);
	}

	@GetMapping("emp/like/{pattern}")
	public List<Employee> findByNameLike(@PathVariable("pattern") String pattern) {

		return employeeService.findByNameLike(pattern);
	}

	// bring only one obj
	@GetMapping("emp/first/byName/{name}")
	public List<Employee> findFirstByName(@PathVariable("name") String name) {

		return employeeService.findFirstByName(name);
	}

	// bring only one obj
	@GetMapping("emp/first/byName/byLevel/{name}")
	public List<Employee> findFirstByNameOrderByLevel(@PathVariable("name") String name) {

		return employeeService.findFirstByNameOrderByLevel(name);
	}

	@GetMapping("emp/email/{name}")
	public List<Employee> findByEmailContaining(@PathVariable("name") String name) {

		return employeeService.findByEmailContaining(name);
	}

	// bring only one obj
	@GetMapping("emp/order")
	public List<Employee> findFirstByOrderByEmail() {

		return employeeService.findFirstByOrderByEmail();
	}

	@GetMapping("emp/lessthan/{level}")
	public List<Employee> findByLevelLessThan(@PathVariable("level") int level) {

		return employeeService.findByLevelLessThan(level);
	}

	@GetMapping("emp/first/order/{level}")
	public List<Employee> findFirst2ByLevelOrderByBirthDateDesc(@PathVariable("level") int level) {
		return employeeService.findFirst2ByLevelOrderByBirthDateDesc(level);
	}

	@GetMapping("emp/date/{date}")
	public List<Employee> findByBirthDateBefore(@PathVariable LocalDate date) {

		return employeeService.findByBirthDateBefore(date);
	}

	@GetMapping("emp/name/order/{name}")
	public List<Employee> findByNameOrderByEmail(@PathVariable String name) {

		return employeeService.findByNameOrderByEmail(name);
	}

	@GetMapping("emp/name/email/{name}/{email}")
	public List<Employee> findByNameAndEmail(@PathVariable String name, @PathVariable String email) {

		return employeeService.findByNameAndEmail(name, email);
	}

	@GetMapping("emp/name/level/{name}/{level}")
	public List<Employee> findByNameOrderByLevelAsc(@PathVariable String name, @PathVariable int level) {
		return employeeService.findByNameOrderByLevelAsc(name, level);
	}

	@GetMapping("emp/name/orderBy/{name}")
	public List<Employee> findByNameOrderByLevel(@PathVariable String name) {
		return employeeService.findByNameOrderByLevelAsc(name);
	}

	@GetMapping("emp/change/{name}/{id}")
	public Integer updateNameOfEmployee(@PathVariable String name, @PathVariable int id) {
		return employeeService.updateNameOfEmployee(name, id);
	}

	@GetMapping("emp/remove/{id}")
	public Integer deleteEmployById(@PathVariable int id) {

		return employeeService.deleteEmployById(id);
	}
}
