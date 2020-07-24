package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "customer")
//@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "ID",nullable = false)
	private Long ID;

// @Column(name = "fullname")
	private String fullname;

// @Column(name = "phone")
	private int phone;

// @Column(name = "address")
	private String address;

// @Column(name = "email")
	private String email;

	public Customer() {
		super();
	}

	public Customer(Long ID, String fullname, int phone, String address, String email) {
		super();
		this.ID = ID;
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", fullname=" + fullname + ", phone=" + phone + ", address=" + address
				+ ", email=" + email + "]";
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
