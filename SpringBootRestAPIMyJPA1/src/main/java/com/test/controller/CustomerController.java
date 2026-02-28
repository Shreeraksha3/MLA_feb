package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.repository.CustomerRepository;
import com.test.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/customer/v1/api")
@Tag(name="CUSTOMER CRUD OPERATIONS")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@Autowired
	private CustomerRepository repository;
	@PostMapping("/create")
	@Operation(summary="CREATE CUSTOMER")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cus)
	{
		Customer cobj=service.saveCustomer(cus);
		if(cobj!=null)
		{
			return new ResponseEntity<>(cobj, HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>(cobj, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value="/list", produces = "application/json")
	@Operation(summary="Listing all Customer")
	public ResponseEntity<List<Customer>> listAllCustomers()
	{
		List<Customer> list=service.getAllCustomers();
		if(list.size()>0)
		{
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value="/{id}", produces="application/json")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int id)
	{
		Optional<Customer> cobj=service.getCustomerById(id);
		if(cobj!=null)
		{
			return new ResponseEntity<>(cobj, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(cobj, HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping(value="/{id}", consumes="application/json")
	public ResponseEntity<Customer> updateCustomerById(@PathVariable int id, @RequestBody Customer cus)
	{
		
		cus.setId(id);
		Customer cobj=service.updateCustomer(cus);
		if(cobj!=null)
		{
			return new ResponseEntity<>(cobj,  HttpStatus.ACCEPTED);
		}
		else
		{
			//throw (new EmployeeNotFoundException("NO_CONTENT_GIVEN_REQUEST"));
			return new ResponseEntity<>(cobj,  HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(value="/{id}", produces="application/json")
	public ResponseEntity<List<Customer>> deleteCustomerById(@PathVariable int id)
	{
		List<Customer> list=service.deleteCustomerById(id);
		if(list.size()>0)
		{
			return new ResponseEntity<>(list,  HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(list,  HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/byname/{name}")
	@Operation(summary="get Customer by name")
	public ResponseEntity<List<Customer>> getCustomerByName(@PathVariable String name)
	{
		
		List<Customer> cobj=repository.getCustomersByName(name);
		if(cobj.size()>0)
		{
			return new ResponseEntity<>(cobj,  HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(cobj,  HttpStatus.NOT_FOUND);
		}
	}
	
//	@GetMapping("/bycmp/{company}")
//	@Operation(summary="get employee by company")
//	public ResponseEntity <List<Employee>> getEmployeeByCompany(@PathVariable String company)
//	{
//		
//		List<Employee> list=repository.getEmployeesByCompany(company);
//		if(list.size()>0)
//		{
//			return new ResponseEntity<>(list,  HttpStatus.OK);
//		}
//		else
//		{
//			return new ResponseEntity<>(list,  HttpStatus.NOT_FOUND);
//		}
//	}
//	
	@GetMapping("/cuslist/asc")
	@Operation(summary="Customer by asc order by name")
	public ResponseEntity<List<Customer>> getCustomerByNameASC()
	{
		List<Customer> list=repository.getCustomersByNameASC();
		if(list.size()>0)
		{
			return new ResponseEntity<>(list,  HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(list,  HttpStatus.BAD_REQUEST);
		}
	}
}
