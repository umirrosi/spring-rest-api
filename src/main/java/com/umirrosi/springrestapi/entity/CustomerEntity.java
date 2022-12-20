package com.umirrosi.springrestapi.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @Column(name = "id", length = 36)
    private int id;

    @Column(name = "fullName", length = 120)
    private String fullName;

    @Column(name = "address", length = 120)
    private String address;

    @Column(name = "city", length = 120)
    private String city;

    @Column(name = "gender", length = 120)
    private String gender;

    @Column(name = "dateOfBirth", length = 120)
    private Date dateOfBirth;

    @Column(name = "dateOfPlace", length = 120)
    private String dateOfPlace;
}
