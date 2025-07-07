package com.example.vaadinapp.model;

import jakarta.persistence.*;


@Entity
@Table(name = "persons")
@PrimaryKeyJoinColumn(name = "user_id")
public class Person extends User {

	@Column(nullable = false)
	private String name;
	
	private String phone;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address addres;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}
}
