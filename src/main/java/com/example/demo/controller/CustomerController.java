package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;



@Controller
public class CustomerController {
	// Khai bao Logg
//	private static Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerService service;

	
	@RequestMapping("/")
	public String index(Model model) {
		List<Customer> listCustomers = service.listAll();
		model.addAttribute("listCustomers", listCustomers);
		// Thay vi dung Sout => Dung Logg.info

//		LOGGER.info("List Customer={}", listCustomers);
		return "index";

	}

	@RequestMapping("/newCustomer")
	public String showAddCustomerPage(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "addCustomer";

	}
	@RequestMapping(value ="/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
	    service.save(customer);
	    return "redirect:/";
	}
	@RequestMapping("/update/{ID}")
	public ModelAndView showUpdateCustomerPage(@PathVariable int ID) {
		ModelAndView mav = new ModelAndView("updateCustomer");
	    Customer customer = service.get(ID);
	    mav.addObject("customer",customer);
		return mav;
	}

	@RequestMapping("/delete/{ID}")
	public String deleteCustomermer(@PathVariable(name = "ID") int ID) {
	    service.delete(ID);
	    return "redirect:/";    
	}
		
}
