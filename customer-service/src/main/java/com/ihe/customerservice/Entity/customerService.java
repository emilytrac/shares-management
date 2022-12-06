package com.ihe.customerservice.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class customerService {

    @Id
    private int detailId;
    private int customerId;
    private int shareId;
    private String shareType;
    private int quantity;
}
