package in.spring.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.spring.entity.Employee;
import in.spring.repo.EmpRepo;

@Service
public class AppService  {

	
	@Autowired
	private EmpRepo repo;
	
	public boolean saveEmp(String name,MultipartFile imageFile) throws IOException {
		Employee emp=new Employee();
		if (imageFile != null && !imageFile.isEmpty()) {
	        emp.setImageFile(imageFile.getBytes());
	    }
		emp.setName(name);
		Employee save = repo.save(emp);
		if(save!=null) {
			return true;
		}
		return false;
	}
		
	public List<Employee>  getAllEmp(){
		return repo.findAll();
	}
	 
        
}
