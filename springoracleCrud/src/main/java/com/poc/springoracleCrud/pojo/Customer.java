package com.poc.springoracleCrud.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Customer {

	private long id;
	
	private String name;
	
	private int age;
	
	private String city;

	
	public Customer(long id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	

	
	
	
	
}
