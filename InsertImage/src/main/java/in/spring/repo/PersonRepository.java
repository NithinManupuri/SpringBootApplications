package in.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.entity.PersonPic;

public interface PersonRepository  extends JpaRepository<PersonPic,Integer>{

}
