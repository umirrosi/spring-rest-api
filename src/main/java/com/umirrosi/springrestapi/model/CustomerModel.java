package com.umirrosi.springrestapi.model;

import com.umirrosi.springrestapi.entity.CustomerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

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

    public CustomerModel(CustomerEntity entity) { BeanUtils.copyProperties(entity, this);
    }
}
