package com.slipMangement.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String mobileNo;

	private String email;

	private String password;

	private String role;

	private int full_amount;

	public int getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFull_amount() {
		return full_amount;
	}

	public void setFull_amount(int full_amount) {
		this.full_amount = full_amount;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", password=" + password + "]";
	}


	//Build relationship between User and Slips
	@OneToMany(mappedBy = "user") // Refers to the "user" field in Slips entity
	private List<Slips> slips; // List of slips associated with the user

	public List<Slips> getSlips() {
		return slips;
	}
	public void setSlips(List<Slips> slips) {
		this.slips = slips;
	}
	//End of relationship part

}
