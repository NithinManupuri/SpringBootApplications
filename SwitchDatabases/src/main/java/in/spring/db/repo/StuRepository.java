package in.spring.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.db.entity.Student;

public interface StuRepository extends JpaRepository<Student,Integer> {
	

}