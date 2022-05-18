package com.domain;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
	}

	// bean untuk model mapper // supaya bisa inject dari controller / manapun dengan autowired
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
