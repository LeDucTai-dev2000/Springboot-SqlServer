package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepostitory;



@Service
public class CustomerService {
	 @Autowired
	 private CustomerRepostitory cusrepo ;
	     
	    public List<Customer> listAll() {
	        return cusrepo.findAll();
	    }
	     
	    public void save(Customer customer) {
	        cusrepo.save(customer);
	    }
	     
	    public Customer get(long ID) {
	        return cusrepo.findById(ID).get();
	    }
	    
	   
	     
	    public void delete(long ID) {
	        cusrepo.deleteById(ID);
	    }
	    
	  
    
    
    
}
