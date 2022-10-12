package app.netlify.triquetrx.customer.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.netlify.triquetrx.customer.dto.CustomerDTO;
import app.netlify.triquetrx.customer.model.Customer;
import app.netlify.triquetrx.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;
	
	public List<Customer> getAllCustomer(){
		return repository.findAll();
	}
	
	public Customer addNewCustomer(CustomerDTO dto) {
		return repository.save(new Customer(dto.getCustomerName(), dto.getCustomerAddress(), dto.getCustomerCity(), dto.getCustomerNumber(),dto.getCustomerGST()));
	}
	
	public Customer getCustomerById(int id) {
		try {			
			Customer result = repository.findById(id).get();
			return result;
		} catch(NoSuchElementException e) {
			return null;
		}
	}
	
	public long count() {
		return repository.count();
	}

}
