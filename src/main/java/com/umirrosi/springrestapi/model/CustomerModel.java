package com.umirrosi.springrestapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel {
    private int id;
    private String fullName;
    private String address;
    private String city;
    private String gender;
    private Date dateOfBirth;
    private String dateOfPlace;
}
