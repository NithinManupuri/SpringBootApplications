package in.springboot.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data     

public class User {

	@NotBlank(message="Name should be reuired")
	@Size(min=4,max=9,message="Name should be in 4 to 9 characters")
	private String name;
	private String email;
	@Size(min=10,max=10,message="Number should be in 10digits")
	private String phno;
}
