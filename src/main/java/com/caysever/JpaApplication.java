package com.caysever;

import com.caysever.enums.GENDER;
import com.caysever.model.Employee;
import com.caysever.model.FullTimeEmployee;
import com.caysever.model.PartTimeEmployee;
import com.caysever.repository.EmployeeRepository;
import com.sun.tracing.ProbeName;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EmployeeRepository employeeRepository){
		return args -> {
			FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
			fullTimeEmployee.setName("Alican");
			fullTimeEmployee.setSurname("Akkuş");
			fullTimeEmployee.setBirthDay(new Date());
			fullTimeEmployee.setGender(GENDER.MALE);
			fullTimeEmployee.setTotalWorkingHoursOfWeek(40);

			employeeRepository.save(fullTimeEmployee);
		};
	}

	@Bean
	CommandLineRunner runner2(EmployeeRepository employeeRepository){
		return args -> {
			employeeRepository.findAll().stream().forEach(System.out::println);
		};
	}

}
