package com.emily.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
	
	int detailId;
	int customerId;
	int shareId;
	String shareType;
	int quantity;

}
