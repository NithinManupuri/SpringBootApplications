package in.spring.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.login.entity.Course;


public interface CourseRepository extends JpaRepository<Course,Integer>{
	

}
