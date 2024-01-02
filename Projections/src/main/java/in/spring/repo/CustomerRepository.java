package in.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.spring.entity.Customer;
import jakarta.transaction.Transactional;

public interface CustomerRepository extends JpaRepository<Customer,String> {
	
  @Transactional
  @Modifying
  @Query("insert into Customer(name,product,amount) values(:name, :product, :amount)")
 public void insert(String name,String product,Double amount);
  
  
  @Query("from Customer")
  public List<Customer> getData();
  @Transactional
  @Modifying
  @Query("delete from Customer where name= :name")
  public void delete(String name);
  
  
	

}
