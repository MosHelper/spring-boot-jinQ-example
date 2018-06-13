package com.example.demo.repo;


import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long>,CustomerRepositoryyCustom{

	List<Customer> findByLastName(String lastName);

}

