package com.example.vaadinapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.example.vaadinapp.model.Role;
import com.example.vaadinapp.model.RoleName;
import com.example.vaadinapp.repository.RoleRepository;

@SpringBootApplication
public class VaadinSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaadinSpringAppApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner datainitializer(RoleRepository roleRepository) {
		return args -> {
			for	(RoleName rn : RoleName.values()) {
				if (roleRepository.findByName(rn.name()) == null) {
					roleRepository.save(new Role(rn));
				}
			}
		};
	}
}
