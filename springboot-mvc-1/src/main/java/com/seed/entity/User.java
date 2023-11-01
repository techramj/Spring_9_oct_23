package com.seed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="seed_users")
public class User {
	@Id
	private int id;
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private String mobileNo;
	private String password;
	
}
