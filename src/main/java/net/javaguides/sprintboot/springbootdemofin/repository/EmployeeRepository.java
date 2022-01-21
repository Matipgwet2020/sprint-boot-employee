package net.javaguides.sprintboot.springbootdemofin.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.sprintboot.springbootdemofin.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

	Optional<Employee> findByStatut(String employeeStatut);

	List<Employee> findAllByStatut(String employeeStatut);

}