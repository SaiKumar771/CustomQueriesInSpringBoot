package com.learn.springboot.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learn.springboot.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByEmailOrName(String name, String email);

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

	public List<Employee> findFirstByName(String name); // findFirst only bring one object

	public List<Employee> findFirstByNameOrderByLevel(String name); // // findFirst only bring one object

	public List<Employee> findByEmailContaining(String name);

	public List<Employee> findFirstByOrderByEmail(); // findFirst only bring one object

	public List<Employee> findByLevelLessThan(int level);

	public List<Employee> findFirst2ByLevelOrderByBirthDateDesc(int level);

	public List<Employee> findByBirthDateBefore(LocalDate date);

	public List<Employee> findByNameOrderByEmail(String name);

	// @Query usage

	@Query("select e from Employee e where e.name=?1 and e.email=?2")
	public List<Employee> findByNameAndEmail(String name, String email);

	@Query("select e from Employee e where e.name=?1 and e.level=?2 order by level")
	public List<Employee> findByNameOrderByLevelAsc(String name,int level);

	@Query("select e from Employee e where e.name=?1  order by level")
	public List<Employee> findByNameOrderByLevelAsc(String name);

	@Modifying
	@Transactional
	@Query("Update Employee e set e.name=?1 where id=?2")
	public Integer updateNameOfEmployee(String name, int id);

	@Modifying
	@Transactional
	@Query("Delete Employee e where e.id=?1")
	public Integer deleteEmployById( int id);

}
