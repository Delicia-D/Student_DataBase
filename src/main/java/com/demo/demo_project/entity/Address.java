package com.demo.demo_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Column(name="city")
	private String city;
	
	@Column(name="street")
	private String street;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
    @OneToOne(mappedBy="address")
	private StudentsInfo student;
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	

}
