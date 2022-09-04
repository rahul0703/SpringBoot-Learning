package com.example.demo;

import com.example.demo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@SpringBootApplication
@RestController //This RestController will make/combine the restful api
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping //This method will act as Get method of Restful API via RestController
	public List<Student> hello(){
		return new ArrayList<>(Arrays.asList(new Student("Rahul", "rahulsureka516@gmail.com", new Date(99, Calendar.MARCH, 7))));
	}
}
