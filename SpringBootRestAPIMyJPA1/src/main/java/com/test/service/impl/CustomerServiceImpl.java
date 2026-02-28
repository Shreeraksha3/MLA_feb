package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerDao;
import com.test.entity.Customer;
import com.test.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao cusDao;

	@Override
	public Customer saveCustomer(Customer cus) {
		return cusDao.saveCustomer(cus);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return cusDao.getCustomerById(id);
	}

	@Override
	public Customer updateCustomer(Customer cus) {
		return cusDao.updateCustomer(cus);
	}

	@Override
	public List<Customer> deleteCustomerById(int id) {
		return cusDao.deleteCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return cusDao.getAllCustomers();
	}
	
}
