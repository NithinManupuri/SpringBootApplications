package in.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import in.spring.entity.Employee;
import in.spring.repo.EmpRepo;

@Service
public class AppService implements ApplicationRunner{
	@Autowired
	private EmpRepo repo;
	
	
	public Page<Employee> getEmployee(int pageNo,int pageSize){
		if(pageNo<=0) {
			pageNo=1;
			
		}
		
		PageRequest of = PageRequest.of(pageNo - 1, pageSize);
   Page<Employee> all = repo.findAll(of);
		
		
		return all;
		
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		// Initialize with 10 employees during the startup of the application
        for (int i = 1; i <= 9; i++) {
            Employee emp = new Employee(i, "Employee" + i, 1200.9 * i);
            // Save the employee to the repository
            repo.save(emp);
        }

		
	}

}
