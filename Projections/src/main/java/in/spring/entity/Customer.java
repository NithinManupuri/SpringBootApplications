package in.spring.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {
	
	@Id
	@GenericGenerator(name="cc",type=in.spring.entity.CustomGenerator.class)
	@GeneratedValue(generator="cc")
	private String id;
	private String name;
	private String product;
	private Double amount;
}
