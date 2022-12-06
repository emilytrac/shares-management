package com.emily.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetail {
	
	private int customerId;
	private String shareName;
	private int quantity;
	private double marketPrice;
	private double totalValuation;
	private String shareType;

}
