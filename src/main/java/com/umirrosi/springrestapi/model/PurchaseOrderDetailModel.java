package com.umirrosi.springrestapi.model;

import com.umirrosi.springrestapi.entity.PurchaseOrderDetailEntity;
import com.umirrosi.springrestapi.entity.PurchaseOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderDetailModel implements Serializable {
    private Long id;
    private Long poId;
    private Long productId;
    private Double quantity;
    private Double price;
    private Double subAmount;

    public PurchaseOrderDetailModel(PurchaseOrderDetailEntity entity){
        BeanUtils.copyProperties(entity,this);
    }
}