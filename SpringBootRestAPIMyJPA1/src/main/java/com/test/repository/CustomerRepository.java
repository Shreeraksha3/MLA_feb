package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query("select e from Customer e where e.name = ?1")
	List<Customer> getCustomersByName(String name);
	
	@Query("select e from Customer e where e.city=?1")
	List<Customer> getCustomersByCity(String city);
	
	@Query("select e from Customer e order by e.name ASC")
	List<Customer> getCustomersByNameASC();
}
