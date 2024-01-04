package in.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.binding.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
