package app.netlify.triquetrx.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.netlify.triquetrx.customer.dto.CustomerDTO;
import app.netlify.triquetrx.customer.model.Customer;
import app.netlify.triquetrx.customer.service.CustomerService;

@CrossOrigin
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;

	@GetMapping
	public ResponseEntity<?> getAllCustomer(){
		return new ResponseEntity<>(service.getAllCustomer(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> addNewCustomer(@RequestBody CustomerDTO dto){
		Customer result = service.addNewCustomer(dto);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable int id){		
		Customer result = service.getCustomerById(id);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public ResponseEntity<?> getCount(){
		return new ResponseEntity<>(service.count(),HttpStatus.OK);
	}
	
}
