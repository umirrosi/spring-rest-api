package com.umirrosi.springrestapi.model;

import com.umirrosi.springrestapi.entity.PurchaseOrderDetailEntity;
import com.umirrosi.springrestapi.entity.PurchaseOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderDetailModel {
    private Integer id;
    private Integer poId;
    private Integer productId;
    private Double quantity;
    private Double price;
    private Double subAmount;

    public PurchaseOrderDetailModel(PurchaseOrderDetailEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
