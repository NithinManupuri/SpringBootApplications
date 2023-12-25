package springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springdatajpa.entitiy.Donors;

public interface DonorRepository  extends JpaRepository<Donors,String>{

}
