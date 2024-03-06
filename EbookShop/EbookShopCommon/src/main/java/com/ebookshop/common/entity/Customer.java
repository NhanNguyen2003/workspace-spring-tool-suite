package com.ebookshop.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, unique = true,length = 45)
	private String email;
	
	@Column(nullable = false,length = 64)
	private String password;
	
	@Column(name="first_name", nullable = false, length = 45)
	private String firstName;
	
	@Column(name="last_name", nullable = false,length = 45)
	private String lastName;
	
	@Column(name = "phone_number", nullable = false, length = 15)
	private String phoneNumber;
	
	
	
	
}
