package in.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.spring.service.ServiceClass;

@SpringBootApplication
public class CustomGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(CustomGeneratorApplication.class, args);
		 ServiceClass sc=ctxt.getBean(ServiceClass.class);
		 sc.insert();
	}

}
