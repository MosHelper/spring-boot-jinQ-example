package com.example.demo.repo.impl;

import com.example.demo.config.JinQHelpper;
import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepositoryyCustom;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class CustomerRepositoryImpl implements CustomerRepositoryyCustom {

    @Autowired
    private JinQHelpper jinQHelpper;

    public Collection<Customer> customMethod() {
        // Issue a query
        return jinQHelpper.streamAll(Customer.class)
                .where(c -> c.getFirstName().equals("mos"))
                .toList();
    }

}
