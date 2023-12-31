package in.spring.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message="Name is reguired  4 -19 char")
	private String name;

	private String email;
	
	 @Digits(integer = 10, fraction = 0, message = "Phone number should have exactly 10 digits")
	    private long phno;
	
	private String gender;
	private String course;
	private String timings;

	

}
