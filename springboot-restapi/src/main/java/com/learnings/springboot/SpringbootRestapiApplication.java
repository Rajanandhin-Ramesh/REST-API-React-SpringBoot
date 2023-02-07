package com.learnings.springboot;

import com.learnings.springboot.model.Employee;
import com.learnings.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestapiApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setId(1);
//		employee.setFirstName("Ramesh");
//		employee.setLastName("Palani");
//		employee.setEmailId("ramesh@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setId(2);
//		employee1.setFirstName("Krishna");
//		employee1.setLastName("Ramesh");
//		employee1.setEmailId("krishna@gmail.com");
//		employeeRepository.save(employee1);


	}

}