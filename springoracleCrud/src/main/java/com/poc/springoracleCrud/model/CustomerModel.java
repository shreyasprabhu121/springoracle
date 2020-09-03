package com.poc.springoracleCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customerdetails")
@Data
public class CustomerModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private long id;
	
	@Column(name = "customer_name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "city")
	private String city;

	@Override
	public String toString() {
		return "CustomerModel [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	
	
	
	
	
}
