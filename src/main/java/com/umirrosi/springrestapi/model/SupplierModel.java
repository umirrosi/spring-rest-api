package com.umirrosi.springrestapi.model;

import com.umirrosi.springrestapi.entity.CategoryEntity;
import com.umirrosi.springrestapi.entity.SupplierEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierModel {
    private Long id;
    private String supplierName;
    private String contactName;
    private String address;
    private String city;
    private String country;
    private String postalCode;
    private String phone;

    public SupplierModel(SupplierEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
