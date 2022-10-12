package app.netlify.triquetrx.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public @Data @AllArgsConstructor @NoArgsConstructor class CustomerDTO {

	private String customerName;
	private String customerAddress;
	private String customerCity;
	private long customerNumber;
	private String customerGST;
	
}
