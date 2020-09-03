package com.poc.springoracleCrud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.poc.springoracleCrud.genericRepo.JpaSpecificationRepository;
import com.poc.springoracleCrud.model.OrderModel;

public interface OrderRepository extends JpaSpecificationRepository<OrderModel, Long> {

	@Query(value = "SELECT o FROM OrderModel o WHERE o.userName = :name")
	public List<OrderModel> getOrderByName( String name );
}
