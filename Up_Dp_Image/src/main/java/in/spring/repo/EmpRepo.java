package in.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
