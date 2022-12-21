package com.umirrosi.springrestapi.model;

import com.umirrosi.springrestapi.entity.CustomerEntity;
import com.umirrosi.springrestapi.entity.EmployeeEntity;
import com.umirrosi.springrestapi.entity.PurchaseOrderEntity;
import com.umirrosi.springrestapi.entity.ShipperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderModel {
    private Integer id;
    private String poCode;
    private Integer customerId;
    private Integer employeeId;
    private Integer shipperId;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date poDate;
    private Double totalAmount;

    public PurchaseOrderModel(PurchaseOrderEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
