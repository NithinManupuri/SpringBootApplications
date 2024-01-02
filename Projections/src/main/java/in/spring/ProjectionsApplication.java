package in.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.spring.service.ServiceClass;

@SpringBootApplication
public class ProjectionsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(ProjectionsApplication.class, args);
		
		ctxt.getBean(ServiceClass.class).delete();
	}

}
