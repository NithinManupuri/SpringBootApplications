package in.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Employee {
	@Id
     private Integer id;
	private String name;
	private Double sal;
	  public Employee() {
	    }


}
