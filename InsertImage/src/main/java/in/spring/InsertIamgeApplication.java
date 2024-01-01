package in.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.spring.service.ServiceClass;

@SpringBootApplication
public class InsertIamgeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(InsertIamgeApplication.class, args);
		ServiceClass sc=context.getBean(ServiceClass.class);
		sc.insert();
	}

}
