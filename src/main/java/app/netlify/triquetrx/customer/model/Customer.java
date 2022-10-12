package app.netlify.triquetrx.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
public @NoArgsConstructor @Data class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String customerCity;
	private long customerNumber;
	private String customerGST;

	public Customer(String customerName, String customerAddress, String customerCity, long customerNumber,
			String customerGST) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerNumber = customerNumber;
		this.customerGST = customerGST;
	}

}
