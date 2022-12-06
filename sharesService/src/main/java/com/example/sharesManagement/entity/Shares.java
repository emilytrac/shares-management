package com.example.sharesManagement.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Entity
public class Shares {
    @Id
    @Column(name = "shareId")
    private int shareId;

    @Column(name = "shareName")
    private String shareName;

    @Column(name = "marketPrice")
    private float marketPrice;

}
