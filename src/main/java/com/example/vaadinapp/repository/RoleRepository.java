package com.example.vaadinapp.repository;

import com.example.vaadinapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Role, Long> {
	
	Role findByName(String name);

}
