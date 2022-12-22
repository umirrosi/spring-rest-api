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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderModel implements Serializable {
    private Long id;
    private String poCode;
    private Long customerId;
    private Long employeeId;
    private Long shipperId;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date poDate;

    private Double totalAmount;

    private List<PurchaseOrderDetailModel> details = new ArrayList<PurchaseOrderDetailModel>();

    public PurchaseOrderModel (PurchaseOrderEntity entity){
        BeanUtils.copyProperties(entity,this);
    }
}
