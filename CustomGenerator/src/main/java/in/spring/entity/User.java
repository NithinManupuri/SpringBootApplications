package in.spring.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	
	
	@Id
	@GenericGenerator(name = "xx", type= in.spring.entity.Generator.class)
	@GeneratedValue(generator="xx")
	private  String id;
	private String name;
	private String product;
	@Column(columnDefinition = "double default 0.0")
	private double amount;

}
