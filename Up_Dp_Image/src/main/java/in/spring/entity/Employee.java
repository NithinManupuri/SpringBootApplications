package in.spring.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity

public class Employee {

	
	

	public Employee() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	private String name;

	@Lob
	@Column(name = "imageFile", columnDefinition = "LongBlob")
	private byte[] imageFile;

	public byte[] getImageFile() {
		return imageFile;
	}

	public void setImageFile(byte[] imageFile) {
		this.imageFile = imageFile;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
}
