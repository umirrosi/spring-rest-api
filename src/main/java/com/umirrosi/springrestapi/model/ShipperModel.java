package com.umirrosi.springrestapi.model;

import com.umirrosi.springrestapi.entity.ShipperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipperModel {
    private Long id;
    private String shipperName;
    private String phone;

    public ShipperModel(ShipperEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
