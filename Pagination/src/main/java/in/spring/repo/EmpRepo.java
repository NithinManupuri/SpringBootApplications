package in.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.spring.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee ,Integer>{

}
