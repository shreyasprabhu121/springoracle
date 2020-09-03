package com.poc.springoracleCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orderdetails")
@Getter @Setter @NoArgsConstructor
public class OrderModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private long id;
	
	@Column(name = "order_name")
	private String orderName;
	
	@Column(name = "price")
	private long price;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "user_name")
	private String userName;
	
	
	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", orderName=" + orderName + ", price=" + price + ", description=" + description
				+ ", userName=" + userName + "]";
	}

}
