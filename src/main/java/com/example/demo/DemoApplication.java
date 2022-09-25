package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public String Hello(){
//		return "Hello World";
//	}

//	public List<String> Hello(){
//		return List.of("Hell", "World");
//	}

//	public List<Student> Hello(){
//		return List.of(
//				new Student(
//						1L,
//						"John Doe",
//						"johndoe@yahoo.com",
//						21,
//						LocalDate.of(2000, Month.JUNE, 5)
//				)
//		);
//	}
}

