package in.spring.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.login.entity.Timings;


public interface TimingRepository extends JpaRepository<Timings,Integer> {

}
