package in.spring.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.login.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer>{

}
