package in.spring.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Customer {
	public Customer() {
		
	}
	public Customer(Integer id, String name, String product) {
	
		this.id = id;
		this.name = name;
		this.product = product;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String product;

}
