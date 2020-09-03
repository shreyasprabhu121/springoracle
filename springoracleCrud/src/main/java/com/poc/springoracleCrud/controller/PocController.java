package com.poc.springoracleCrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springoracleCrud.model.CustomerModel;
import com.poc.springoracleCrud.pojo.Customer;
import com.poc.springoracleCrud.repo.PocRepository;


@RestController
@RequestMapping("/customer")
public class PocController {

	private static final org.slf4j.Logger LOGGER = 
		    org.slf4j.LoggerFactory.getLogger(PocController.class);

	
	@Autowired
	PocRepository repo;
	
	@GetMapping("/getall")
	public List<CustomerModel> getAll() {
		LOGGER.info("Retrieving all the data");
		return repo.findAll();
	}

	@GetMapping("/getbyname/{name}")
	public List<CustomerModel> findByName(@PathVariable("name") String name) {
		LOGGER.info("Retrieving data with name {}",name);
		return repo.findByNamedQuery(name);
	}
	
	@PostMapping("/add")
	public CustomerModel addCustomer(@RequestBody Customer customer) {
		CustomerModel mymodel=new CustomerModel();
		mymodel.setId(customer.getId());
		mymodel.setAge(customer.getAge());
		mymodel.setCity(customer.getCity());
		mymodel.setName(customer.getName());
		LOGGER.info("New Customer details added {}",mymodel);
		return repo.save(mymodel);
	}


	@GetMapping("/{customerID}")
	public Optional<CustomerModel> getById(@PathVariable("customerID") long customerID) {
		return repo.findById(customerID);
	}

	@PutMapping("/update")
	public Object updateCsutomer(@RequestBody Customer customer) {
		Optional<CustomerModel> data=repo.findById(customer.getId());
		if(data.isPresent()) {
			CustomerModel model=data.get();
			model.setAge(customer.getAge());
			model.setCity(customer.getCity());
			model.setName(customer.getName());
			LOGGER.info("Update operation with {}",model);
			return repo.save(model);
		}
		LOGGER.error("No id found for the given data {}",customer.getId());
		return "User ID not found";
	}

	@DeleteMapping("/{customerID}")
	public void deleteCustomer(@PathVariable("countryId") long customerID) {
		repo.deleteById(customerID);
	}
	

	

	
	
}
