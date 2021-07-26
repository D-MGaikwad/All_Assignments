package com.question4b;
import java.sql.SQLException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.repository.EmployeeRepository;

public class SpringMainClass {

	public static void main(String[] args) throws SQLException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.repository");
		context.refresh();

		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		// store
		repository.store(new Employee(1, "Raman", "Manager"));
		repository.store(new Employee(2, "Steve", "Recruiter"));
		repository.store(new Employee(3, "Daisy", "Assistant"));
		repository.store(new Employee(4, "Lily", "Recruiter"));

		
		System.out.println("Retrieving element:");
		Employee emp = repository.retrieve(1);
		System.out.println(emp);
        System.out.println(" ");
        
		
		System.out.println("Searched element:");
		Employee assi = repository.search("Daisy");
		System.out.println(assi);
		System.out.println(" ");
		 
		
		System.out.println("Element Deleted:");
		Employee recruit = repository.delete(2);
		System.out.println(recruit);

		context.close();
	}
	}


