package com.ebookshop.common.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@Column(nullable = false, length = 64)
	private String addressLine1;
	
	@Column(name = "address_line_2",length = 64)
	private String addressLine2;
	
	@Column(nullable = false, length = 45)
	private String city;
	
	@Column(nullable = false,length = 45)
	private String state;
	
	@Column(name = "postal_code", nullable = false,length = 10)
	private String postalCode;
	
	@Column(name = "verification_code", length = 64)
	private String verificationCode;
	
	private boolean enable;
	
	@Column(name = "created_time")
	private Date createdTime;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
}
