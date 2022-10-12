package app.netlify.triquetrx.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.netlify.triquetrx.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
	
}
