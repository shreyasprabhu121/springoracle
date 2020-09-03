package com.poc.springoracleCrud.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Order {
	
	private long id;
	private String orderName;
	private long price;
	private String description;
	private String userName;
	
	public Order(long id, String orderName, long price, String description, String userName) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.price = price;
		this.description = description;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + ", price=" + price + ", description=" + description
				+ ", userName=" + userName + "]";
	}
	
	
}
